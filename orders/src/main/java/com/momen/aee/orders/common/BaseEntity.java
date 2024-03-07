package com.momen.aee.orders.common;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private Integer version;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdDate;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime lastModifiedDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @Column(name = "DeletedOn")
    private LocalDateTime deletedOn;

    @Column(name = "DeletedBy", length = 50)
    private String deletedBy;

    @Column(name = "isDeleted", length = 50)
    private Boolean isDeleted = false;

    @PreUpdate
    @PrePersist
    public void beforeAnyUpdate() {
        if (isDeleted != null && isDeleted) {

            if (deletedBy == null) {
//                deletedBy = SignedUserHelper.userId().toString();
            }

            if (getDeletedOn() == null) {
                deletedOn = LocalDateTime.now();
            }
        }
    }


}

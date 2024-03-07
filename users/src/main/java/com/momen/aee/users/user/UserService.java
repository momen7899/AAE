package com.momen.aee.users.user;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User save(User user);

    User update(User user);

    void delete(Long id);

    User findById(Long id);

    List<User> findAll();

    Boolean signIn(String username, String password);
}

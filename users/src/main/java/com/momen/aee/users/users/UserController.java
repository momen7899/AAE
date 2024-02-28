package com.momen.aee.users.users;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users/")
@AllArgsConstructor
public class UserController {

    @Qualifier("userServiceImpl")
    private final UserService service;

    @PostMapping()
    User save(@RequestBody User user) {
        return service.save(user);
    }

    @PutMapping()
    User update(@RequestBody User user) {
        return service.update(user);
    }

    @DeleteMapping("{id}/")
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("{id}/")
    void findById(@PathVariable Long id) {
        service.findById(id);
    }


    @GetMapping()
    List<User> all() {
        return service.findAll();
    }

    @GetMapping("/sign-in/")
    Boolean signIn(String userName, String password) {
        return service.signIn(userName, password);
    }

}

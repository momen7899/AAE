package com.momen.aee.users.users;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public User update(User user) {
        User savedBefore = findById(user.getId());
        if (user.getName() != null) savedBefore.setName(user.getName());
        if (user.getUserName() != null)   savedBefore.setUserName(user.getUserName());
        if (user.getPhoneNUmber() != null)    savedBefore.setPhoneNUmber(user.getPhoneNUmber());
        return repository.save(savedBefore);
    }

    @Override
    public void delete(Long id) {
        repository.delete(findById(id));
    }

    @SneakyThrows
    @Override
    public User findById(Long id) {
        Optional<User> user = repository.findById(id);
        if (user.isEmpty())
            throw new Exception("User with not found");

        return user.get();
    }

    @Override
    public List<User> findAll() {
        return (List<User>) repository.findAll();
    }

    @Override
    public Boolean signIn(String username, String password) {
        Optional<User> user = repository.findByUserNameAndPassword(username, password);
        return user.isPresent();
    }
}

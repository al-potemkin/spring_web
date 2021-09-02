package com.potemkin.spring.web.service.interfaces;

import com.potemkin.spring.web.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void saveUser(User user);
    User getUser(int id);
    void deleteUser(int id);
}

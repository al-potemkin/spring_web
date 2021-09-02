package com.potemkin.spring.web.repoitory.interfaces;

import com.potemkin.spring.web.entity.User;

import java.util.List;

public interface UserRepo {
    List<User> getUsers();
}

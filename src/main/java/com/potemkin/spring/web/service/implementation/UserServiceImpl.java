package com.potemkin.spring.web.service.implementation;

import com.potemkin.spring.web.entity.User;
import com.potemkin.spring.web.repoitory.interfaces.UserRepo;
import com.potemkin.spring.web.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    @Transactional
    public List<User> getUsers() {
        return userRepo.getUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userRepo.saveUser(user);
    }

    @Override
    @Transactional
    public User getUser(int id) {
        return userRepo.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userRepo.deleteUser(id);
    }
}


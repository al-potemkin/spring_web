package com.potemkin.spring.web.repoitory.implementation;

import com.potemkin.spring.web.entity.User;
import com.potemkin.spring.web.repoitory.interfaces.UserRepo;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserRepoImpl implements UserRepo {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<User> getUsers() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from User", User.class);
        List<User> userList = query.getResultList();
        return userList;
    }
}

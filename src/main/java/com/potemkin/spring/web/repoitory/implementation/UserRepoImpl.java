package com.potemkin.spring.web.repoitory.implementation;

import com.potemkin.spring.web.entity.User;
import com.potemkin.spring.web.repoitory.interfaces.UserRepo;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepoImpl implements UserRepo {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getUsers() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from User ", User.class);
        List<User> userList = query.getResultList();
        return userList;
    }

    @Override
    public void saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
    }

    @Override
    public User getUser(int userId) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, userId);
        return user;
    }

    @Override
    public void deleteUser(int userId) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("delete from User where userId =:id");
        query.setParameter("id", userId);
        query.executeUpdate();
    }
}

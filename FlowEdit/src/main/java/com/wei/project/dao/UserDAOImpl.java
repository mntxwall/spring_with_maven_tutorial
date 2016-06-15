package com.wei.project.dao;

import com.wei.project.entities.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by cw on 6/15/16.
 */
public class UserDAOImpl implements UserDAO {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(User user) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(user);
        tx.commit();
        session.close();
    }

    @Override
    public User getLoginUser(String username) {

        String hql = "from User Where NAME = :name";
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery(hql);
        query.setParameter("name", username);
        List<User> list =  query.list();

        list.forEach((tmp) ->
        {System.out.println(String.format("User name is %s, passowrd is %s", tmp.getName(), tmp.getPassword()));});

        return list.get(0);
    }
}

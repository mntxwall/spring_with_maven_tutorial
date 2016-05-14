package com.wei.test.dao;

import com.wei.test.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by cw on 5/14/16.
 */
public class PersonDAOImpl implements PersonDAO {
  private SessionFactory sessionFactory = null;

  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  public void save(Person p) {
    Session session = this.sessionFactory.openSession();
    Transaction tx = session.beginTransaction();
    session.persist(p);
    tx.commit();
    session.close();
  }


}

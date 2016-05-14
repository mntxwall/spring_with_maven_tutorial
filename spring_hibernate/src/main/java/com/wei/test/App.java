package com.wei.test;

import com.wei.test.dao.PersonDAO;
import com.wei.test.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cw on 5/14/16.
 */
public class App {
  public static void main(String[] args){
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-hibernate.xml");
    PersonDAO personDAO = (PersonDAO) context.getBean("personDAO");

    Person p = new Person();
    p.setName("Wei");
    p.setCountry("China");

    personDAO.save(p);

    System.out.println(p);

    context.close();

  }
}

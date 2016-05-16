package com.wei.test;

import com.wei.test.config.CDPlayerConfig;
import com.wei.test.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cw on 16-5-9.
 */
public class App {
  public static void main(String[] args){
    ApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayerConfig.class);

    CompactDisc cd = (CompactDisc) ctx.getBean("blankDisk");
    CDPlayer cdPlayer = ctx.getBean(CDPlayer.class);

    cd.play();

    cdPlayer.play();

 /*   ApplicationContext context =
            new ClassPathXmlApplicationContext("spring-model.xml");

    CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
    Customer customer = new Customer("mkyong",28);
    customerDAO.insert(customer);

    Customer customer1 = customerDAO.findByCustomerId(1);
    System.out.println(customer1);*/


    //  System.out.println("Helllo");
  }
}

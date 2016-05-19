package com.wei.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by cw on 16-5-19.
 */
public class App {

  public static void main(String... args){
    ApplicationContext context = new AnnotationConfigApplicationContext(ShowConfig.class);

    Performance p = (Performance) context.getBean("romioandjuliet");

    p.perform();
  }
}

package com.wei.test;

import com.wei.test.config.CDPlayerConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by cw on 16-5-9.
 */
public class App {
  public static void main(String[] args){
    ApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayerConfig.class);

    CompactDisc cd = (CompactDisc) ctx.getBean("lonelyHearts");

    cd.play();

  //  System.out.println("Helllo");
  }
}

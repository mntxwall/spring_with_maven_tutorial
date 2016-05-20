package com.wei.test;

import com.wei.test.bean.CompactDisc;
import com.wei.test.bean.Performance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cw on 16-5-20.
 */
public class App {
  public static void main(String... args){
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

    //Performance p = (Performance) context.getBean("opera");

    //p.perform();
    CompactDisc cd = (CompactDisc) context.getBean("cd");
    cd.playTrack(0);
//    System.out.println("HelloWorld");
  }
}

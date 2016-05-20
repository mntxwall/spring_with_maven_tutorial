package com.wei.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by cw on 16-5-20.
 */
public class Audience {
  public void watchPerformance(ProceedingJoinPoint jp){
    try{
      System.out.println("Silencing cell phones");
      System.out.println("Taking seats");
      jp.proceed();

      System.out.println("CLAP CLAP CLAP");

    }catch (Throwable e){
      System.out.println("Demanding a refund");
    }

  }
}

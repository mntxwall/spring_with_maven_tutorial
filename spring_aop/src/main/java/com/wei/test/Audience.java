package com.wei.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by cw on 16-5-19.
 */
@Aspect
public class Audience {
  @Pointcut("execution(** com.wei.test.Performance.perform(..))")
  public void performance(){}

  @Around("performance()")
  public void watchPerformance(ProceedingJoinPoint jp){
    try{
      System.out.println("Silencing cell phones");
      System.out.println("Taking seats");
      jp.proceed();
      System.out.println("CLAP CLAP CLAP!!!!");
    }catch (Throwable e){
      System.out.println("Demanding a refund");
    }

  }
}

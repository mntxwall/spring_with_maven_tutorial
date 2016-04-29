package com.wei.test;

/**
 * Created by cw on 16-4-29.
 */
public class FactoryMothodTest {
  //private static int index = 0;
  public FactoryMothodTest(){
    System.out.println("inited");
  }
  public static String helloIndex(){
    //FactoryMothodTest.index = 101;
    //System.out.println("This is in the helloIndex");
    return "This is in the helloIndex";
  }
}

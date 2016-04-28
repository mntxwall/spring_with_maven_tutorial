package com.wei.test;

/**
 * Created by cw on 16-4-28.
 */
public class TestService {
  private TestReader tr = null;
  public TestService(TestReader pTr){
    this.tr = pTr;
  }
  public void doSomething(){
    //tr.setIndex(100);
    System.out.println("This is in the Service " + tr.getIndex());
  }
  public void toSetSomething(){
    tr.setIndex(100);
  }
}

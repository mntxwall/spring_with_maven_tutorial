package com.wei.test;

/**
 * Created by cw on 16-4-28.
 */
public class TestReader {
  private int testIndex = 0;
  public TestReader(int index){
    this.testIndex = index;
    System.out.println("Printed means that it has been initialied!!");
  }
  public void setIndex(int index){
    this.testIndex = index;
  }
  public int getIndex(){
    return this.testIndex;
  }
}

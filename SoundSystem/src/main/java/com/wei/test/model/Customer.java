package com.wei.test.model;

/**
 * Created by cw on 16-5-10.
 */
public class Customer {
  private int custId;
  private String name;
  private int age;

  public Customer(int cust_id, String name, int age) {
    this.custId = cust_id;
    this.name = name;
    this.age = age;
  }

  public int getCustId(){
    return custId;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }

  public void setCustId(int custId){
    this.custId = custId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

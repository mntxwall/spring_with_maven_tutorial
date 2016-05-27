package com.wei.test;


import org.springframework.stereotype.Component;

/**
 * Created by cw on 5/27/16.
 */

public class UserForm {
  private String firstName;
  private String lastName;
  private String userName;
  private String password;

  public UserForm(){

  }

  public UserForm(String firstName, String lastName, String userName, String password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.password = password;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString(){
    return String.format("This is %s.%s", this.firstName, this.lastName);
  }
}

package com.wei.test;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by cw on 5/27/16.
 */
@Component
public class UserForm {

  @NotNull
  @Size(max = 200)
  private String firstName;

  @NotNull
  @Size(max = 200)
  private String lastName;

  @NotNull
  @Size(min = 5, max = 16)
  private String userName;

  @NotNull
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

package com.wei.test.model;

import javax.persistence.*;

/**
 * Created by cw on 5/14/16.
 */
@Entity
@Table(name = "Person")
public class Person {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id = 0;

  @Column(name = "name")
  private String name = null;

  @Column(name = "country")
  private String country = null;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString(){
    return String.format("id is %d, name is %s come from %s", this.id, this.name, this.country);
  }
}

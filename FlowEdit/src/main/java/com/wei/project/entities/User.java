package com.wei.project.entities;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by cw on 6/13/16.
 */
@Entity
@Table(name="User")
public class User {

    @Id
    @Column(name = "CUST_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME")
    @Size(min = 2, max = 10)
    private String name;

    @Column(name = "PASSWORD")
    @NotEmpty
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.wei.test.data;

import javax.validation.constraints.NotNull;

/**
 * Created by cw on 6/1/16.
 */
public class User {

    @NotNull
    private String name;

    @NotNull
    private String age;

    //default Initialer
    public User(){}

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

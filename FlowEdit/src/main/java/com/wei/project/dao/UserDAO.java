package com.wei.project.dao;

import com.wei.project.entities.User;

/**
 * Created by cw on 6/15/16.
 */
public interface UserDAO {
    void save(User user);
    User getLoginUser(String username);
}

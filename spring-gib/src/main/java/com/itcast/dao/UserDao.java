package com.itcast.dao;

import com.itcast.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();


    public void saveUser(User user);
}

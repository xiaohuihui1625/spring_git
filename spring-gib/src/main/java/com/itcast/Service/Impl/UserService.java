package com.itcast.Service.Impl;


import com.itcast.dao.UserDao;
import com.itcast.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component("userService")
public class UserService implements com.itcast.Service.UserService {

    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public List<User> findAll() {
        System.out.println("Service执行了");

        return dao.findAll();
    }

    public void saveUser(User user) {

    }
}

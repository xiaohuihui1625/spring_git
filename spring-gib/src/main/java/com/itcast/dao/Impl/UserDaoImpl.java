package com.itcast.dao.Impl;

import com.itcast.dao.UserDao;
import com.itcast.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("userDao")
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {


    public List<User> findAll(){
        List<User> users = getJdbcTemplate().query("select * from user", new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    public void saveUser(User user) {

    }
}

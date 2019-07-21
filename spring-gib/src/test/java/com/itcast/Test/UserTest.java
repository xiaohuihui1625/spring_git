package com.itcast.Test;

import com.itcast.Service.UserService;
import com.itcast.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class UserTest {

    @Test
    public void findAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserService service = ac.getBean(UserService.class);
        List<User> users = service.findAll();
        System.out.println(users);

    }

    @Test
    public void saveUser(){
        User user = new User();
        user.setUsername("混个脸熟");
        user.setBirthday(new Date());
        user.setSex("女");
        user.setAddress("西安");
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = ac.getBean(UserService.class);
        userService.saveUser(user);
    }
}

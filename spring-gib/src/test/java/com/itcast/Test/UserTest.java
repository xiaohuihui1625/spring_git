package com.itcast.Test;

import com.itcast.Service.UserService;
import com.itcast.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {

    @Test
    public void findAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserService service = ac.getBean(UserService.class);
        List<User> users = service.findAll();
        System.out.println(users);

    }
}

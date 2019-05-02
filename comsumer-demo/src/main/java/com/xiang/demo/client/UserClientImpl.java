package com.xiang.demo.client;

import com.xiang.demo.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientImpl implements UserClient {
    @Override
    public User method(Integer id) {
        User user=new User();
        user.setUsername("连接超时了");
        return user;
    }
}

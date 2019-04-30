package com.xiang.user.service;

import com.xiang.user.mapper.UserMapper;
import com.xiang.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    protected UserMapper userMapper;
    public User queryById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
}

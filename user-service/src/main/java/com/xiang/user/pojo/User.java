package com.xiang.user.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;


    @Table(name = "user1")
    @Data
    public class User  {

        @Id
        @KeySql(useGeneratedKeys = true)
        private Integer id;

        // 用户名
        private String username;

        // 密码
        private String password;




    }



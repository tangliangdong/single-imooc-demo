package com.imooc.service;

import com.imooc.mapper.UsersMapper;
import com.imooc.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StuService {

    @Autowired
    private UsersMapper usersMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    public Integer saveParent(){
        Users users = new Users();
        users.setId("1");
        users.setNickname("老王");
        users.setUsername("123");
        users.setPassword("123");
        users.setSex(1);
        return usersMapper.insert(users);
    }

    public Integer saveChildren(){
        Users users = new Users();
        users.setId("2");
        users.setNickname("小王");
        int i = 1/0;
        users.setSex(0);
        return usersMapper.insert(users);
    }
}

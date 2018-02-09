package com.mind.service;

import com.mind.dao.UserInfoMapper;
import com.mind.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springbootshiro
 * @description: 实现类
 * @author: Mind
 * @create: 2018-02-09 14:36
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService{


    @Autowired
    UserInfoMapper userInfoMapper;


    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoMapper.findByUsername(username);
    }
}

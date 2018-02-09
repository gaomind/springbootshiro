package com.mind.service;


import com.mind.pojo.UserInfo;

/**
 * Created by gaomi on 2018/2/9.
 */
public interface UserInfoService {

    public UserInfo findByUsername(String username);

}

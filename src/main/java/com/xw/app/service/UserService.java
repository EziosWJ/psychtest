package com.xw.app.service;

import com.xw.app.dao.UserDao;
import com.xw.app.model.UserModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;
    public UserModel selectUser(long id){
        return userDao.selectUser(id);
    }
}

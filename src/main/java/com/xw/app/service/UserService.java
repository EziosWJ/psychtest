package com.xw.app.service;

import com.xw.app.dao.UserDao;
import com.xw.app.dao.UserModelMapper;
import com.xw.app.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public UserService() {
        System.out.println("===========userservice!");
    }

    @Resource
    private UserModelMapper userModelMapper;

    public UserModel selectUser(long id){
        return userDao.selectUser(id);
    }

    public int putUser(UserModel userModel){
        int i = userModelMapper.insert(userModel);
        return i;
    }

    public UserModel findUserById(int id){
        return userModelMapper.selectByPrimaryKey(id);
    }
}

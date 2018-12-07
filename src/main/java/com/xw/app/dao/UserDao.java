package com.xw.app.dao;

import com.xw.app.model.UserModel;

public interface UserDao {
    UserModel selectUser(long id);
}

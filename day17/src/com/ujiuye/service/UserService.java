package com.ujiuye.service;

import com.ujiuye.dao.UserDao;
import com.ujiuye.entity.User;

import java.util.List;

public class UserService {
    UserDao dao = new UserDao();
    public User testUserName(String username){
        return dao.findUserByUserName(username);
    }
    public List<User> search(String search){
        return dao.findUserByName(search);
    }
}

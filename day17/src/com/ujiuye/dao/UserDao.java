package com.ujiuye.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.ujiuye.entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDao {
    ComboPooledDataSource dataSource = new ComboPooledDataSource();
    QueryRunner qr = new QueryRunner(dataSource);
    public User findUserByUserName(String username){
        String sql = "select * from user where username = ?";
        try {
            return qr.query(sql,new BeanHandler<User>(User.class),username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> findUserByName(String search) {
        String sql = "select * from user where name like ?";
        try {
            return qr.query(sql,new BeanListHandler<User>(User.class),"%" +search +"%");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
/*    public List<User> findUserByName(String search){

    }*/
}

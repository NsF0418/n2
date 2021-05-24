package com.ujiuye.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.ujiuye.entity.Student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class StudentDao {
    ComboPooledDataSource dataSource = new ComboPooledDataSource();
    QueryRunner qr = new QueryRunner(dataSource);
    public List<Student> findStudentMation(String search){
        String sql = "select * from student";
        try {
            return qr.query(sql,new BeanListHandler<Student>(Student.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

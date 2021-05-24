package com.ujiuye.service;

import com.ujiuye.dao.StudentDao;
import com.ujiuye.entity.Student;

import java.util.List;

public class StudentService {
    StudentDao dao = new StudentDao();
    public List<Student> findStuMation(String search){
        return dao.findStudentMation(search);
    }

}

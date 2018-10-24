package com.gjp.example.service;

import com.gjp.example.mbg.dao.MBGStudentDao;
import com.gjp.example.mbg.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 耿俊鹏 on 2018/8/23.
 */
@Service
public class StudentService {

    @Autowired
    MBGStudentDao mbgStudentDao;

    public Student queryStudentById(int Id){
        Student stu=mbgStudentDao.selectByPrimaryKey(Id);
        return stu;
    }

    @Transactional
    public String  addStudent (){
        Student stu=new Student();
        stu.setName("王五");
        stu.setAge(20);
        stu.setAdress("杭州");
        int n=mbgStudentDao.insertSelective(stu);
        return "ok";
    }
}

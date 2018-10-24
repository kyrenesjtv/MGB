package com.gjp.example.Controller;

import com.gjp.example.mbg.model.Student;
import com.gjp.example.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 耿俊鹏 on 2018/8/23.
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StudentService studentService;

    @ResponseBody
    @RequestMapping("/queryStudentById")
    public Student queryStudentById(int Id){
        logger.info("studentId:"+Id);
        return studentService.queryStudentById(Id);
    }

    @ResponseBody
    @RequestMapping("/addStudent")
    public String addStudent (){
        return  studentService.addStudent();
    }

}

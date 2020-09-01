package com.webfullstackdev.simpleprog.spb.spbmssimpleprogramming.controller;

import com.webfullstackdev.simpleprog.spb.spbmssimpleprogramming.model.Student;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {


    @PostMapping
    public String saveStudentInfo(@RequestBody Student student){
        if( StringUtils.isEmpty(student.getLastName())){

        }
        return "Data save!0";
    }



}

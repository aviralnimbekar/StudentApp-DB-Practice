package com.studentapp.student.controller;

import com.studentapp.student.entity.StudentEntity;
import com.studentapp.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

//    @GetMapping("students")
//    public List<StudentEntity> student() {
//
//    }

    @RequestMapping(value = "save/students", method = RequestMethod.POST)
    public Optional<StudentEntity> students(@RequestBody StudentEntity studentEntity) {   //Return type can be changed
        studentRepository.save(studentEntity);
        return studentRepository.findById(1);
    }
}

package com.example.controller;


import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


    @GetMapping("/getAll")
    public List<Student> getAllStudent(){

//        ArrayList<Student> list = new ArrayList<Student>();
//        Student
//        list.add(new Student("amit"));


        return this.studentService.getAllStudents();
    }

    @GetMapping("/get/{id}")

    public Student getById(@PathVariable("id") int id){

        return this.studentService.getStudent(id);
    }


    @PostMapping("/save")
    private Student addStudent(@RequestBody Student std)
    {
        return studentService.saveOrUpdate(std);

    }

    @DeleteMapping("/delete/{id}")
    public Student deleteStudent(@PathVariable("id")int id){
        studentService.deleteStudentById(id);
        return null;
    }

}

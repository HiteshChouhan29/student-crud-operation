package com.example.service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){

        return this.studentRepository.findAll();
    }

    public Student getStudent(int id){

        return this.studentRepository.findById(id).orElse(null);
    }



    public void deleteStudentById(int id)
    {

       try {
           studentRepository.deleteById(id);
       }

       catch(Exception e) {
           System.out.println(e);
          }

    }

    public Student saveOrUpdate(Student std) {
        return this.studentRepository.save(std);
    }

}

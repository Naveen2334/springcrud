package com.example.CRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CRUD.dto.Student;
import com.example.CRUD.service.StudentServices;

@RestController("/student")
public class StudentController {
	
	@Autowired
	private StudentServices studentServices;
	
    @GetMapping
	public Iterable<Student> list(Student student) {
		return studentServices.listAllStudents();
		
	}
    @DeleteMapping("/{id}")
    public String delete(Student student) {
    	return studentServices.deleteStudent(student);
		
    }

}

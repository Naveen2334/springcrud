package com.example.CRUD.service;

import com.example.CRUD.dto.Student;

public interface StudentServices {
	
	Iterable<Student> listAllStudents();
	
	Student saveStudent(Student student);
	String deleteStudent(Student student);

	String getStudentById(String studentId);

	Student getStudentById(Integer studentId);


	
	
	

}

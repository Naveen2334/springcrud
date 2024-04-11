package com.example.CRUD.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.CRUD.dto.Student;
import com.example.CRUD.repository.StudentRepository;
import com.example.CRUD.service.StudentServices;

public class StudentserviceImpl implements StudentServices {

	
	@Autowired
	private StudentRepository studentRepository;
	
	
	
	@Override
	public Iterable<Student> listAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}



	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.delete(student);
		
	}



	@Override
	public Student getStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		return studentRepository.getById(studentId);
	}



	@Override
	public String getStudentById(String studentId) {
		// TODO Auto-generated method stub
		return null;
	}
 
	
	

}
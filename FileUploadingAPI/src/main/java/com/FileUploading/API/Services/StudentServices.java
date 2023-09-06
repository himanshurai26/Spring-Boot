package com.FileUploading.API.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.FileUploading.API.Dao.AddressRepository;
import com.FileUploading.API.Entites.Student;

@Service
public class StudentServices {
	
	@Autowired
	AddressRepository addressRepository;
	
	public List<Student> getAllStudent(){
		
	List<Student> list = (List<Student>)this.addressRepository.findAll();
	
	return list;
	}
	
	public Student getstudentById(int studentId) {
		  Student book =(Student)this.addressRepository.findById(studentId);
	   
		  return book;
	   
	   }
	
	public Student addStudent(Student student) {
		
		Student student1 = this.addressRepository.save(student);
		
		return student1;
	}
	
	public void deleteStudent(int stId) {
		this.addressRepository.deleteById(stId);
	}
	
	public void updateStudent(Student student, int stuId) {
		
		student.setStudentId(stuId);
		this.addressRepository.save(student);
	}

}

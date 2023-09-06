package com.FileUploading.API;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FileUploading.API.Entites.Student;
import com.FileUploading.API.Services.StudentServices;

@RestController
public class Controller {
	
	@Autowired
	StudentServices studentServices;

	@GetMapping("/student")
	public ResponseEntity<List<Student>> getAllStudent(){
		List<Student> list = this.studentServices.getAllStudent();
		
		if(list.size() <= 0 ) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}else {
			return ResponseEntity.status(HttpStatus.CREATED).body(list);
		}
		
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") int studentId){
		
		Student student = this.studentServices.getstudentById(studentId);
		
		if(student == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		else {
			return ResponseEntity.of(Optional.of(student));
		}
	}
	
	@PostMapping("/student")
	public ResponseEntity<Student> addStudent(@RequestBody() Student student){
		
		try {
			Student student1 = this.studentServices.addStudent(student);
			System.out.println(student);
			return ResponseEntity.of(Optional.of(student));
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
			}
		
		}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<Void> deletestudentById(@PathVariable("id") int studentId){
		
		try {
			this.studentServices.deleteStudent(studentId);

			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PutMapping("/student/{id}")
	public ResponseEntity<Student> updateStudent(@RequestBody() Student student, @PathVariable("id") int id){
		
		try {
		 this.studentServices.updateStudent(student, id);
		
		return ResponseEntity.ok().body(student);
				
		}catch(Exception e) {
			e.printStackTrace();
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}

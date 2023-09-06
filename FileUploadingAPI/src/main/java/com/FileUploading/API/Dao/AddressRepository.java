package com.FileUploading.API.Dao;

import org.springframework.data.repository.CrudRepository;

import com.FileUploading.API.Entites.Student;
public interface AddressRepository extends CrudRepository<Student, Integer> {

	public Student findById(int id);
}

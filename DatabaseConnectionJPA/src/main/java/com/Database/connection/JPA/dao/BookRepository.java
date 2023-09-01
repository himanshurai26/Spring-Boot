package com.Database.connection.JPA.dao;

import org.springframework.data.repository.CrudRepository;

import com.Database.connection.JPA.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
public Book findByid(int id);


	
}

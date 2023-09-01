package com.api.bookdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.bookdemo.entities.Book;
import com.api.bookdemo.service.bookService;

@RestController
public class BookController {

	@Autowired
	bookService bookservice;

	/** 
	 * @GetMapping("/Books") //@ResponseBody not compolsory public List<Book>
	 * getBooks(){
	 * 
	 * return this.bookservice.getAllBooks();
	 * 
	 * }
	 */
	
	//Handling Https status
	@GetMapping("/Books")
	public ResponseEntity<List<Book>> getBooks(){
		List<Book> list = bookservice.getAllBooks();
		
		if(list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(list));
		
	}
	
	@GetMapping("/Books/{id}")
	public Book getBookbyId(@PathVariable("id") int id) {

		return this.bookservice.getBookByid(id);
	}

	@PostMapping("/Books")
	public Book addbook(@RequestBody Book book) {

		Book book1 = this.bookservice.addBoo(book);

		return book1;
	}

	// delete book handler

	@DeleteMapping("/Books/{id}")
	public void deleteBookHandler(@PathVariable("id") int bookId) {

		this.bookservice.deleteBook(bookId);

	}

	// Update Book handler
	@PutMapping("/Books/{id}")
	public Book updateBookHandler(@RequestBody Book book, @PathVariable("id") int bookId) {

		this.bookservice.updateBook(book, bookId);
		return book;

	}

}

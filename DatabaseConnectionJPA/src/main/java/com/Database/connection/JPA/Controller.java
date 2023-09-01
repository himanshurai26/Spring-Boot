package com.Database.connection.JPA;

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

import com.Database.connection.JPA.entities.Book;
import com.Database.connection.JPA.services.BookServices;

@RestController
public class Controller {
	
	@Autowired
	BookServices bookService;
	
	@GetMapping("/book")
	public ResponseEntity<List<Book>> getAllBook(){
		
		List<Book> list = this.bookService.getAllBooks();

		if(list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
		}else {
			return ResponseEntity.status(HttpStatus.CREATED).body(list);
		}
	}
	
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") int Bid){
		Book book = this.bookService.getBookById(Bid);
	if(book == null) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	else {
		return ResponseEntity.of(Optional.of(book));
	}
	}
	
	@PostMapping("/book")
	public ResponseEntity<Book> addBook(@RequestBody() Book book){
		
		
		try {
			
			Book book1 = this.bookService.addBook(book);
			System.out.println(book1);
			return ResponseEntity.of(Optional.of(book));
			
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@DeleteMapping("/book/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable("id") int bookId){
		try {
			this.bookService.deleteBook(bookId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PutMapping("/book/{id}")
	public ResponseEntity<Book> updateByid(@RequestBody Book book, @PathVariable("id") int bookId){
		try {
			
			this.bookService.updateBook(book, bookId);
			return ResponseEntity.ok().body(book);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}

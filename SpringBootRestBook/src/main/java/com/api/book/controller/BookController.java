package com.api.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.intities.Book;
import com.api.book.services.BookService;

@RestController
//@Controller no need to write it now we are usinng restcontroller anotation 
public class BookController {

	
	//@RequestMapping(value="/Books", method = RequestMethod.GET)
	// now there is no need to write @RequestMapping because GetMapping take care 
	// of it
	@Autowired
	private BookService bookService;
	
	@GetMapping("/Books")
	public List<Book> getBooks()
	{
		//now we have to import bookservices;
		
		
//		Book book = new Book();
//	
//		book.setId(432);
//		book.setTitle("Complete Java Programming by John Wick.. ");
//		book.setAuthor("Himanshu");
//		
	 return this.bookService.getAllBooks();
	}
	
	@GetMapping("/Books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		
		return bookService.getBookById(id);
	}
	
	@PostMapping("/Books")
	public Book addBook(@RequestBody Book book)
	{
		
		Book book1 = this.bookService.addBook(book);
		 System.out.println(book1);
		 return book1;
	}
	
	@DeleteMapping("/Books/{id}")
	public void deleteBookHandler(@PathVariable("id") int bookId) {
		this.bookService.deleteBook(bookId);
		
	}
	
	
}

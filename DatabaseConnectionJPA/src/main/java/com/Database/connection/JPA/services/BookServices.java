package com.Database.connection.JPA.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Database.connection.JPA.dao.BookRepository;
import com.Database.connection.JPA.entities.Book;

@Service
public class BookServices {

	@Autowired
	private BookRepository bookRepository;

   public List<Book> getAllBooks(){
	 List<Book> list =(List<Book>)this.bookRepository.findAll();
	   
	   return list;
	   
   }
   
   //get single data by id
   
   public Book getBookById(int bookId) {
	  Book book =(Book)this.bookRepository.findByid(bookId);
   
	  return book;
   
   }
   
   public Book addBook(Book book) {
	  Book book1 = this.bookRepository.save(book);
   
	  return book1;
   }
   
   public void deleteBook(int BookId) {
	   this.bookRepository.deleteById(BookId);
   }
   
   public void updateBook(Book book, int bookId) {
	   
	   book.setId(bookId);
	   this.bookRepository.save(book);
   }

}

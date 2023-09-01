package com.api.book.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.book.intities.Book;

@Component
public class BookService {
  
	private static List<Book> list = new ArrayList<>();
	
	static {
		list.add(new Book(12, "Java Programming", "ABC"));
		list.add(new Book(14, "Python Programming", "Pythonist"));
		list.add(new Book(17, "Php Programming", "BCX"));
	}
	
	//get all books
	
	public List<Book> getAllBooks()
	{
		
		return list;
	}
	
	//get single by id
	
	public Book getBookById(int id)
	{
		Book book = null;
		
		book = list.stream().filter(e->
			e.getId()==id).findFirst().get();
	    return book;
	}
	
	//adding the book
	public Book addBook(Book book)
	{
		list.add(book);
		
		return book;
	}
	
	public void deleteBook(int id) {
		List<Book> bookstoRemove = new ArrayList<>();
		for(Book book : list) {
			if(book.getId() == id) {
				bookstoRemove.add(book);
			}
		}
		
		list.remove(bookstoRemove);
	}
	
	
	

}

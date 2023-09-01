package com.api.bookdemo.entities;

public class Book {
	private int id;
	private String bookName;
	private int numberOfPage;
	private String author;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String bookName, int numberOfPage, String author) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.numberOfPage = numberOfPage;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getNumberOfPage() {
		return numberOfPage;
	}

	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", numberOfPage=" + numberOfPage + ", author=" + author
				+ "]";
	}
	
	
	
	

}

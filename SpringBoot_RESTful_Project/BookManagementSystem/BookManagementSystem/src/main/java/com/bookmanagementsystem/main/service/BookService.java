package com.bookmanagementsystem.main.service;

import com.bookmanagementsystem.main.model.Book;

public interface BookService {

	
	public void saveBookData(Book b);
	
	public Iterable<Book> displaybook();
	
	//public void savebookdata(int bid);

	public void deleteBook(int bid);
	

}

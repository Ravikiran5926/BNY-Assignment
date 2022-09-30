package com.bookmanagementsystem.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bookmanagementsystem.main.model.Book;
import com.bookmanagementsystem.main.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bs;
	
	@PostMapping(value = "/addBook")
	public void saveBookData(@RequestBody Book b)
	{
		bs.saveBookData(b);
		 
	}
	
	@GetMapping(value = "/getAllBook")
	public Iterable<Book> getAllBook()
	{
		Iterable<Book> list=bs.displaybook();
		
		return list;
		
	}
	
    @PutMapping(value = "/updateBookData/{bid}")
	public Iterable<Book> updateBookData(@PathVariable ("bid") int bid,@RequestBody Book b)
	{
    	bs.saveBookData(b);
    	Iterable<Book> list=bs.displaybook();         
		return list;
		
	}
    
    @DeleteMapping(value = "/deleteBook/{bid}")
    public Iterable<Book> deleteBook(@PathVariable ("bid") int bid,@RequestBody Book b)
    {
    	  bs.deleteBook(bid);
    	Iterable<Book> list=bs.displaybook();         
		return list;
    }

}

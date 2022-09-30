package com.bookmanagementsystem.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmanagementsystem.main.model.Book;
import com.bookmanagementsystem.main.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService 
{
	@Autowired
	 BookRepository br;

	@Override
	public void saveBookData(Book b) 
	{
		
		 br.save(b);
	}

	@Override
	public Iterable<Book> displaybook() 
	{
		
		return br.findAll();
	}

	@Override
	public void deleteBook(int bid) 
	{
		br.deleteById(bid);
	}

	

	

}

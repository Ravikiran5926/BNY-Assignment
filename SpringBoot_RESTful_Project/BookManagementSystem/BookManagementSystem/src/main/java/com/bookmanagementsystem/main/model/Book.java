package com.bookmanagementsystem.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Book 
{

	@Id
	private int bid;
	private String bname;
	private String author;
	private String publisher;
	private int price;
}

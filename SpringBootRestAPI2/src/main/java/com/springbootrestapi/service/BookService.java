package com.springbootrestapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springbootrestapi.entites.BooksEntites;
@Component
public class BookService {
     //here create ArrayList
	 private static  List<BooksEntites> list=new ArrayList<>();
	 
	 //here create block
	 static 
	 {
		 list.add(new BooksEntites(12,"java developer","xyz"));
		 list.add(new BooksEntites(13,"Paythen developer","xyb"));
		 list.add(new BooksEntites(14,"Dot.net developer","xyc"));
	 }
	 //here create method
	 //get all books 
	 //this method return all books 
	 //here is create Multiple books  
	 public  List<BooksEntites> getAllBooks()
	 {
		 return list;
	 }
	 //here is create Single books
	 //get single book by id
	 public BooksEntites getAllBookById(int id)
	 {
		 //here i am using StreemAPI
		 BooksEntites books=null;
		books= list.stream().filter(e->e.getBook_id()==id ).findFirst().get();
			 
		 return books;
	 }
}

package com.springbootrestapi.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrestapi.entites.BooksEntites;
import com.springbootrestapi.service.BookService;

//import com.springbootjpa.entites.BooksEntites;
@RestController
public class TestController {
	
	  //here is create your handler method 
		//@RequestMapping(value="/books",method= RequestMethod.GET)
		//@ResponseBody
	
	   @Autowired
	    private BookService bookService;
	    
		@GetMapping("/books")
		 public List<BooksEntites> getBooks()
		 {
			
			return this.bookService.getAllBooks();
			 
		 }


}

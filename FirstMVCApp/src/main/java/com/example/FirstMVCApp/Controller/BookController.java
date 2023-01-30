package com.example.FirstMVCApp.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.FirstMVCApp.Model.Book;

@Controller
public class BookController {
@GetMapping("/Books")
	public ModelAndView Bookdetails() {
	
Book book=new Book();
book.setBookid(111);
book.setBname("java");

book.setBprice(675);

ModelAndView mav=new ModelAndView();
mav.addObject("BOOK",book);
mav.setViewName("book");
return mav;
	
	
	}
	

@GetMapping("/getAllBooks")
public ModelAndView getAllBooks() {

	Book book = new Book();
	book.setBookid(111);
	book.setBname("Java");
	book.setBprice(675);

	Book book1 = new Book();
	book1.setBookid(222);
	book1.setBname("C++");
	book1.setBprice(675);

	Book book2 = new Book();
	book2.setBookid(333);
	book2.setBname("Python");
	book2.setBprice(675);

	List<Book> books = new ArrayList<Book>();
	books.add(book);
	books.add(book1);
	books.add(book2);
	
	ModelAndView mav=new ModelAndView();
	mav.addObject("BOOKS",books);
	mav.setViewName("books");
	

	return mav;

}
}

package in.ashokit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.bindings.Book;
@Controller
public class BookController {
	@GetMapping("/book")
public String getBookData(Model model) {
	Book bookObj = new Book(101,"Spring",450.00);
	model.addAttribute("book", bookObj);
	return "book";
	
}
	@GetMapping("/books")
	public String getBooksData(Model model) {
		Book b1 = new Book(102,"SpringCore",550.00);
		Book b2 = new Book(102,"CoreJava",650.00);
		Book b3 = new Book(103,"AWS",750.00);
	    List<Book> booksList = Arrays.asList(b1,b2,b3);
		model.addAttribute("books", booksList);
		return "books";
		
	}
}

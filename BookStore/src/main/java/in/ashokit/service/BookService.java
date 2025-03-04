package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;
import in.ashokit.repository.BookRepository;

@Service
public class BookService {
@Autowired
private BookRepository bRepo;
public void save(Book b) {
	bRepo.save(b);
}
public List<Book> getAllBook(){
	return bRepo.findAll();
}
public Book getBookById(int id) {
	return bRepo.findById(id).get();
	
}
}

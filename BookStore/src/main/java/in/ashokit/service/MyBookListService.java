package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.MyBookList;
import in.ashokit.repository.MyBookRepository;

@Service
public class MyBookListService {
@Autowired
private MyBookRepository mybook;

public void saveMyBooks(MyBookList book) {
	mybook.save(book);
}
public List<MyBookList> getAllMyBooks(){
	return mybook.findAll();
	
}
}

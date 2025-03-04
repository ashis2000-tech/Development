package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
private Integer id;
private String name;
private String author;
private Double price;
public Book(Integer id, String name, String author, Double price) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
	this.price = price;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

}

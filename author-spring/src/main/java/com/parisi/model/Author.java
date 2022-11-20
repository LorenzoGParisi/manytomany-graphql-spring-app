package com.parisi.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "authors")
public class Author {
	@Id
	private Long id;
	private String name;
	private int age;
	private List<Book> authorBooks;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Book> getAuthorBooks() {
		return authorBooks;
	}
	public void setAuthorBooks(List<Book> authorBooks) {
		this.authorBooks = authorBooks;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", age=" + age + ", authorBooks=" + authorBooks + "]";
	}
}

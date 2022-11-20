package com.parisi.authorspring.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.parisi.authorspring.model.Author;
import com.parisi.authorspring.model.Book;
import com.parisi.authorspring.repostitory.AuthorRepository;
import com.parisi.authorspring.repostitory.BookRepository;

@Component
public class Query implements GraphQLQueryResolver {
	
	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	
	@Autowired
	public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
		// TODO Auto-generated constructor stub
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}
	
	public List<Author> findAllAuthors(){
		return authorRepository.findAll();
	}
	
	public Long countAuthors() {
		return authorRepository.count();
	}
	
	public List<Book> findAllBooks(){
		return bookRepository.findAll();
	}
	
	public Long countBooks() {
		return bookRepository.count();
	}
}

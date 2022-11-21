package com.parisi.authorspring.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.parisi.authorspring.model.Author;
import com.parisi.authorspring.model.Book;
import com.parisi.authorspring.repostitory.AuthorRepository;
import com.parisi.authorspring.repostitory.BookRepository;

@Component
public class Mutation implements GraphQLMutationResolver {
	
	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	
	@Autowired
	public Mutation(AuthorRepository authorRepository, BookRepository bookRepository) {
		// TODO Auto-generated constructor stub
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}
	
	public Author createAuthor(String name, Integer age) {
	    Author author = new Author();
	    author.setName(name);
	    author.setAge(age);
	    return authorRepository.save(author);
	}
	
	public Book createBook(String title, String description) {
		Book book = new Book();
		book.setTitle(title);
		book.setDescription(description);
		return bookRepository.save(book);
	}
	  
	public boolean deleteAuthor(Long id) {
		authorRepository.deleteById(id);
		return true;
	}
	
	public boolean deleteBook(Long id) {
		bookRepository.deleteById(id);
		return true;	
	}
	  
	  
}

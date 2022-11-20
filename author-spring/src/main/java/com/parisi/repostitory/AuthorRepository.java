package com.parisi.repostitory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.parisi.model.Book;

public interface AuthorRepository extends MongoRepository<Book, Long> {

}

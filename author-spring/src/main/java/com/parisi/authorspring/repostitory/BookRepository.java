package com.parisi.authorspring.repostitory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.parisi.authorspring.model.Book;

public interface BookRepository extends MongoRepository<Book, Long>{

}

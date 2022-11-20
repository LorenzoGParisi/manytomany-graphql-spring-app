package com.parisi.authorspring.repostitory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.parisi.authorspring.model.Author;

public interface AuthorRepository extends MongoRepository<Author, Long> {

}

package com.riyaraghuwanshi.bookAuthorMapping.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.riyaraghuwanshi.bookAuthorMapping.model.Author;

@Repository
public interface AuthorRepository extends MongoRepository<Author, String>{


}

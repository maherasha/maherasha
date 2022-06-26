package com.springcrud.springmongodocker.repository;

import com.springcrud.springmongodocker.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book, Integer> {


}

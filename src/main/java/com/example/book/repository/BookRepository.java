package com.example.book.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.book.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {
	
	public Book findByName(String name);

}

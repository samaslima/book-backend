package com.example.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.model.Book;
import com.example.book.repository.BookRepository;

@Service
public class BookService {
	
	private BookRepository repository;
	
	@Autowired
	public BookService(BookRepository repository) {
		this.repository = repository;
	}
	
	public List<Book> findAll() {
		return repository.findAll();
	}
	
	public Book insert(Book book) {
		return repository.save(book);
	}
	
	public Optional<Book> findById(Long id) {
		return repository.findById(id);
	}
	
	public Book findByName(String name) {
		return repository.findByName(name);
	}
	
	public boolean delete(Long id) {
		if (repository.findById(id) != null) {
			repository.deleteById(id);
			
			return true;
		}
		
		return false;
	}

}

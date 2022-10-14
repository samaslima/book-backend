package com.example.book.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.model.Book;
import com.example.book.service.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookController {
	
	private BookService service;
	
	@Autowired
	public BookController(BookService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<Book>> findAll() {
		List<Book> books = service.findAll();
		
		return ResponseEntity.ok().body(books);
	}
	
	@PostMapping
	public ResponseEntity<Book> insert(@Valid @RequestBody Book book) {
		book = service.insert(book);
		
		return ResponseEntity.ok().body(book);
	}
	
	

}

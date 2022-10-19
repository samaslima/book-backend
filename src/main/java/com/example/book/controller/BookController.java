package com.example.book.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Book> update(@Valid @PathVariable String id, @RequestBody Book book) {
		book = service.update(id, book);
		
		return ResponseEntity.ok().body(book);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<List<Book>> delete(@Valid @PathVariable String id) {
		List<Book> books = service.delete(id);
		
		return ResponseEntity.ok().body(books);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Book>> findById(@Valid @PathVariable String id) {
		Optional<Book> book = service.findById(id);
		
		return ResponseEntity.ok().body(book);
	}
	
	@GetMapping(value = "/find/{name}")
	public ResponseEntity<Book> findByName(@Valid @PathVariable String name) {
		Book book = service.findByName(name);
		
		return ResponseEntity.ok().body(book);
	}

}

package com.example.book.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Table(name = "books")
@Data
public class Book implements Serializable {

	private static final long serialVersionUID = -6825553722851212683L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "The name in the book is required.")
	private String name;
	
	@NotEmpty(message = "The author in the book is required.")
	private String author;
	
	@NotEmpty(message = "The number of pages in the book is required.")
	private Integer pages;
	
	private List<Genre> genres;
	
	
}

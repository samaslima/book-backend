package com.example.book.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book implements Serializable {

	private static final long serialVersionUID = -6825553722851212683L;

	@Id
	private String id;

	@NotEmpty(message = "The name in the book is required.")
	private String name;

	@NotEmpty(message = "The author in the book is required.")
	private String author;

	@NotNull(message = "The number of pages in the book is required.")
	private Integer pages;

	private List<Genre> genres;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

}

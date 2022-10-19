package com.example.book.model;

public enum Genre {

	FANTASY(0), DYSTOPIA(1), ACTION(2), FICTION(3), HORROR(4), ROMANCE(5);

	private Integer numGenre;

	Genre(Integer num) {
		this.numGenre = num;
	}

	public Integer getNumGenre() {
		return numGenre;
	}

	public void setNumGenre(Integer numGenre) {
		this.numGenre = numGenre;
	}

}

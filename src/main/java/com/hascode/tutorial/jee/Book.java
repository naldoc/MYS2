package com.hascode.tutorial.jee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String title;

	@NotNull
	private String author;

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getTitle() {
                System.out.println("Esta es una linea que agregamos!!!!!");
		return title;
	}

	public void setTitle(final String title) {
                System.out.println("Otra linea de codigo");
		this.title = title;
	}

	public String getAuthor() {
                System.out.println("Otra linea de codigo abc");
		return author;
	}

	public void setAuthor(final String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author
				+ "]";
	}
}

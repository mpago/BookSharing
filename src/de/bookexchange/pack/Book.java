package de.bookexchange.pack;

public class Book {
	
	private String title;
	private String author;
	private String condition;

	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, String author, String condition) {
		this.title = title;
		this.author = author;
		this.condition = condition;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	

}

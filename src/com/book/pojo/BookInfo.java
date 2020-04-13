package com.book.pojo;

public class BookInfo {

	private Integer id;
	private String bookName;
	private String author;
	private Integer categoryId;
	private String publisher;
	private Double price;
	private String photo;
	private BookCategory bookCategory;
	public BookCategory getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public BookInfo(String bookName, String author, Integer categoryId, String publisher, Double price,
			String photo) {
		super();
		
		this.bookName = bookName;
		this.author = author;
		this.categoryId = categoryId;
		this.publisher = publisher;
		this.price = price;
		this.photo = photo;
	}
	public BookInfo(int id, String bookName, String author, Integer categoryId, String publisher, Double price,
			String photo) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.categoryId = categoryId;
		this.publisher = publisher;
		this.price = price;
		this.photo = photo;
	}
	public BookInfo() {
		super();
	} 
	
}

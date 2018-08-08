package ec.com.gm.springoauthanotherdemo;

public class Book {
	private String title;
	private String author;
	private String year;
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	public Book(String title, String author, String year) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
	}
	public String getName() {
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
}

package entity;

import java.util.Arrays;

public class Book_management {
	private Reader reader;
	private BookBorrow [] bookBorrow;
	public Book_management(Reader reader, BookBorrow[] bookBorrow) {
		super();
		this.reader = reader;
		this.bookBorrow = bookBorrow;
	}
	public Book_management() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	public BookBorrow[] getBookBorrow() {
		return bookBorrow;
	}
	public void setBookBorrow(BookBorrow[] bookBorrow) {
		this.bookBorrow = bookBorrow;
	}
	@Override
	public String toString() {
		return "Book_management [reader=" + reader + ", bookBorrow=" + Arrays.toString(bookBorrow) + "]";
	}
	
}

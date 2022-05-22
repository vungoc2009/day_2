package entity;

public class BookBorrow {
	private Book book;
	private int quantity;
	public BookBorrow(Book book, int quantity) {
		this.book = book;
		this.quantity = quantity;
	}
	public BookBorrow() {
		
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "BookBorrow [book=" + book + ", quantity=" + quantity + "]";
	}
	
	
}

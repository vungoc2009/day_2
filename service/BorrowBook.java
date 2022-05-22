package service;

import java.util.Scanner;

import Main.mainn;
import entity.Book;
import entity.BookBorrow;
import entity.Book_management;
import entity.Reader;

public class BorrowBook {
	public static Scanner sc = new Scanner(System.in);

	public static Reader input_reader(int n) {
		System.out.println("nhap ma ban doc thú" + (n + 1) + "muon muon sach");
		Reader reader = null;
		do {
			System.out.println("nhap id ban doc");
			int id_reader = sc.nextInt();
			for (int i = 0; i < mainn.readers.length; i++) {
				if (mainn.readers[i] != null && mainn.readers[i].getId() == id_reader) {
					reader = mainn.readers[i];
					break;
				}
			}
			if (reader != null) {
				break;
			}
		} while (true);
		return reader;
	}

	public static BookBorrow[] intputbookborrow() {
		System.out.println("nhap so luong dau sach sach muon doc");
		int quantity = 0;
		do {
			quantity = sc.nextInt();
			if (quantity > 0 && quantity <= 5) {
				break;
			}
			System.out.println("muon toi da 5 dau sach thoi");
		} while (true);
		BookBorrow[] bookBorrows = new BookBorrow[quantity];
		for (int i = 0; i < bookBorrows.length; i++) {
			System.out.println("nhap ma dau sach thu " + (i + 1) + " muon muon");
			Book book = null;
			do {
				int id_book = sc.nextInt();
				for (int j = 0; j < mainn.books.length; j++) {
					if (mainn.books[j] != null && mainn.books[j].getId() == id_book) {
						book = mainn.books[j];
						break;
					}
				}
				if (book != null) {
					break;
				}
				System.out.println("khong tim thay sach");
			} while (true);
			
			System.out.println("dau sach nay ban muon muon bao nhieu cuon");
			int quantity_1 = 0;
			do {
				quantity_1 = sc.nextInt();
				if(quantity_1 > 0 && quantity_1 <=3) {
					break;
				}
				System.out.println("chi dươc muon 3 cuon tren 1 dau sach thoi");
			}while(true);
			
			BookBorrow  bookborrow = new BookBorrow(book , quantity_1);
			
			for(int j =0 ; j < bookBorrows.length ; j++) {
				if(bookBorrows[j] == null) {
					bookBorrows[j] = bookborrow;
					break;
				}
			}
		}
		return bookBorrows;
	}

	public static void save(Book_management book_management) {
		for (int i = 0; i < mainn.book_management.length; i++) {
			if (mainn.book_management[i] == null) {
				mainn.book_management[i] = book_management;
				break;
			}
		}
	}
	
	public static void borrow() {
		if (in_out_reader.isEmpty() || in_out_book.isEmpty()) {
			return;
		}
		System.out.println("nhap so luonh sach ban muon doc");
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			Reader reader = input_reader(number);
			BookBorrow [] bookBorrow = intputbookborrow();
			Book_management book_management = new Book_management(reader ,bookBorrow );
			save(book_management);
		}
	}

	public static void show() {
		for(int i =0 ; i < mainn.book_management.length ; i++) {
			if(mainn.book_management[i] == null) {
				continue;
			}
			System.out.println(mainn.book_management[i]);
		}
	}

}

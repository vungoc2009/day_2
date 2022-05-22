package service;
import java.util.Scanner;

import Main.mainn;
import entity.Book;
public class in_out_book {
	public static Scanner sc = new Scanner(System.in);
	public void new_book(Book [] books) {
		System.out.println("nhap so luong sach moi");
		int n = sc.nextInt();
		for(int i =0 ; i <n; i++) {
			Book a = new Book();
			a.inputBook();
			save(a);
		}
	}
	public static void save (Book book) {
		for(int i =0 ; i < mainn.books.length; i++) {
			if(mainn.books[i] == null) {
				mainn.books[i] = book;
				return ;
			}
		}
	}
	public void outBook(Book[] books) {
		for(int i =0 ; i < books.length ; i++) {
			if(books[i] == null) {
				continue;
			}
			System.out.println(books[i]);
		}
	}
	public static boolean isEmpty() {
		for(int i =0 ; i < mainn.books.length ; i++) {
			if(mainn.books[i] != null) {
				return false;
			}
		}
		return true;
	}
}

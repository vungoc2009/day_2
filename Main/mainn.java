package Main;

import java.util.Scanner;

import entity.Book;
import entity.Book_management;
import entity.Reader;
import service.BorrowBook;
import service.Search;
import service.in_out_book;
import service.in_out_reader;
import service.sort;

public class mainn {

	
	public static Reader [] readers = new Reader[100];
	public static Book [] books = new Book[100];
	public static Book_management [] book_management = new Book_management[100];
	public static void main(String[] args) {
		
		
		in_out_reader a = new in_out_reader();
		in_out_book b = new in_out_book();
		BorrowBook c = new BorrowBook();
		sort d = new sort ();
		Search e = new Search();
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("1: nhap ban doc moi");
			System.out.println("2: in ra ban doc da co");
			System.out.println("3: nhap sach moi");
			System.out.println("4: in ra danh sach da co");
			System.out.println("5: cho muon sach");
			System.out.println("6: sap xep");
			System.out.println("7: tim kiem");
			System.out.println("8: thoat");
			System.out.println("moi ban nhap lua chon");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				a.new_Reader(readers);
				break;
			case 2:
				a.outReader(readers);
				break;
			case 3:
				b.new_book(books);
				break;
			case 4:
				b.outBook(books);
				break;
			case 5:
				c.borrow();
				c.show();
				break;
			case 6 :
				d.Sort();
				break;
			case 7:
				e.search();
				break;
			case 8:
				break;
			}
			
				
		}
	}
}

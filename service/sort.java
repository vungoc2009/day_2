package service;

import java.util.Scanner;

import Main.mainn;
import entity.Book_management;

public class sort {
	public static Scanner sc = new Scanner(System.in);

	public static void Sort() {
		System.out.println("nhap lua chon");
		System.out.println("1: sap xep theo ten reader");
		System.out.println("2: sap xep theo so luong sach");
		int lua_chon = 0;
		do {
			lua_chon = sc.nextInt();
			if (lua_chon == 1 || lua_chon == 2) {
				break;
			}
			System.out.println("moi ban nhap lai lua chon");
		} while (true);
		switch (lua_chon) {
		case 1:
			for (int i = 0; i < mainn.book_management.length; i++) {
				if (mainn.book_management[i] == null) {
					continue;
				}
				for (int j = i + 1; j < mainn.book_management.length; j++) {
					if (mainn.book_management[j] == null) {
						continue;
					}
					if (mainn.book_management[i].getReader().getName()
							.compareTo(mainn.book_management[j].getReader().getName()) > 0) {
						Book_management temp = mainn.book_management[i];
						mainn.book_management[j] = mainn.book_management[j];
						mainn.book_management[j] = temp;
					}
				}
			}
			BorrowBook a = new BorrowBook();
			a.show();
			break;
			
			
		case 2:
			for (int i = 0; i < mainn.book_management.length; i++) {
				if (mainn.book_management[i] == null) {
					continue;
				}
				for (int j = i + 1; j < mainn.book_management.length; j++) {
					if (mainn.book_management[j] == null) {
						continue;
					}
					if(mainn.book_management[i].getBookBorrow().length < mainn.book_management[j].getBookBorrow().length) {
						Book_management temp = mainn.book_management[j];
						mainn.book_management[i] = mainn.book_management[j];
						mainn.book_management[i] = temp;
					}
				}
			}
			BorrowBook b = new BorrowBook();
			b.show();
			break;
		}

	}
}

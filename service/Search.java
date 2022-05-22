package service;

import java.util.Scanner;

import Main.mainn;

public class Search {
	public static Scanner sc = new Scanner(System.in);
	public static void search () {
		System.out.println("nhap ten ban doc muon tim");
		String name = sc.next();
		for(int i =0 ; i < mainn.book_management.length ; i++) {
			if(mainn.book_management[i] != null && mainn.book_management[i].getReader().getName().equals(name)) {
				System.out.println(mainn.book_management[i]);
			}else {
				System.out.println("khong co ban doc nay");
			}
		}
	}
}

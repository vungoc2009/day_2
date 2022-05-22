package entity;

import java.util.Scanner;

import Type.type_book;

public class Book {
	public static Scanner sc = new Scanner(System.in);

	private static int Auto_id = 10000;

	private int id;
	private String nameBook;
	private String author;
	private type_book specialized;
	private int year;

	public Book(int id, String nameBook, String author, type_book specialized, int year) {
		super();
		this.id = id;
		this.nameBook = nameBook;
		this.author = author;
		this.specialized = specialized;
		this.year = year;
	}

	public Book() {
		/*if(Auto_id ==-1) {
			Auto_id = 10000;
			this.id = Auto_id;
			return ;
		}
		this.id = Auto_id++;*/
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public type_book getSpecialized() {
		return specialized;
	}

	public void setSpecialized(type_book type) {
		this.specialized = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void inputBook() {
		this.id = Book.Auto_id++;
		System.out.println("nhap ten sach");
		this.nameBook = sc.next();
		System.out.println("nhap ten tac gia");
		this.author = sc.next();
		System.out.println("nhap chuyen nganh sach");
		System.out.println("1. khoa hoc tu nhien");
		System.out.println("2. dien tu vien thong");
		System.out.println("3. van hoc nghe thuat");
		System.out.println("4. cong nghe thong tin");
		int n ;
		do {
			n = sc.nextInt();
			if(n >=1 && n <= 4) {
				break;
			}
			System.out.print("lua chon khong hop le : ");
		}while(true);
		switch(n) {
		case 1:
			this.setSpecialized(type_book.khtn);
			break;
		case 2:
			this.setSpecialized(type_book.dtvt);
			break;
		case 3:
			this.setSpecialized(type_book.vhnt);
			break;
		case 4:
			this.setSpecialized(type_book.cntt);
			break;
		}
		System.out.print("nhap nam xuat ban ");
		this.year = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", nameBook=" + nameBook + ", author=" + author + ", specialized=" + specialized
				+ ", year=" + year + "]";
	}
	
}

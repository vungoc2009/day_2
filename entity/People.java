package entity;

import java.util.Scanner;

public class People {
	public static Scanner sc = new Scanner(System.in);
	protected int id;
	private String name ;
	private String address;
	private String sđt;
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}
	public People(int id, String name, String address, String sđt) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.sđt = sđt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSđt() {
		return sđt;
	}
	public void setSđt(String sđt) {
		this.sđt = sđt;
	}
	public void inputPeople() {
		System.out.println("nhap ten ban doc");
		this.name = sc.next();
		System.out.println("nhap dia chi");
		this.address = sc.next();
		System.out.println("nhap sdt");
		this.sđt = sc.next();
	}
}

package entity;

import java.util.Scanner;
import Type.type_reader;

public class Reader extends People {
	

	public static Scanner sc = new Scanner(System.in);
	private static int auto_id = -1;
	private int mbd;
	private type_reader reader_type;
	public Reader() {
		if(auto_id==-1) {
			auto_id=10000;
			id=auto_id;
			return;
		}
		this.id=auto_id ++;
	}
	public type_reader getReader_type() {
		return reader_type;
	}

	public void setReader_type(type_reader reader_type) {
		this.reader_type = reader_type;
	}

	public void input_rader() {
		this.mbd = Reader.auto_id++;
		super.inputPeople();
		System.out.println("Nhap Loai Ban Doc ");
		System.out.println("1. Sinh viên.");
		System.out.println("2. Hoc Vien Cao Hoc");
		System.out.println("3. Giao Vien.");
		int n;
		do {
			n = sc.nextInt();
			if (n >= 1 && n <= 3) {
				break;
			}
			System.out.print("lua chon khong hop le , moi chon lai ");
		} while (true);
		switch(n) {
		case 1:
			this.setReader_type(type_reader.sv);
			break;
		case 2:
			this.setReader_type(type_reader.hvch);
			break;
		case 3:
			this.setReader_type(type_reader.gv);
			break;
		}
	}

	@Override
	public String toString() {
		return "Reader [mbd=" + id + ", reader_type=" + reader_type + ", getMbd()=" + id + ", getReader_type()="
				+ getReader_type() + ", getId()=" + getId() + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getSđt()=" + getSđt() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
}

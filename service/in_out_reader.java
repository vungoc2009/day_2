package service;

import java.util.Scanner;

import Main.mainn;
import entity.Reader;

public class in_out_reader {
	public static Scanner sc = new Scanner(System.in);

	public void new_Reader(Reader [] readers) {
		System.out.println("nhap so luong reader muon them");
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			Reader r=new Reader();
			r.input_rader();
			save(r);
		}
	}
	
	public static void save (Reader reader) {
		for(int i =0 ; i < mainn.readers.length; i++) {
			if(mainn.readers[i] == null) {
				mainn.readers[i] = reader;
				return ;
			}
		}
	}
	public void outReader(Reader[] readers) {
		for (int i = 0; i < readers.length; i++) {
			if (readers[i] == null) {
				continue;
			}
			System.out.println(readers[i]);
		}
	}
	public static boolean isEmpty() {
		for(int i =0 ; i < mainn.readers.length ; i++) {
			if(mainn.readers[i] != null) {
				return false;
			}
		}
		return true;
	}
}

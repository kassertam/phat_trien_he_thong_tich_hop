package Bai1;

import Bai2.FileTReader;

public class MyThreadA extends Thread{
	
	FileTWrite f;
	MyThreadA(FileTWrite f){
		this.f=f;
	}
	public MyThreadA() {
		// TODO Auto-generated constructor stub
		f.write("1.txt");
		System.out.println("Ghi file 1 thanh cong");
	}
	
}


package Bai1;

public class MyThreadB extends Thread{
	
	FileTWrite f;
	MyThreadB(FileTWrite f){
		this.f=f;
	}
	public MyThreadB() {
		// TODO Auto-generated constructor stub
		f.write("2.txt");
		System.out.println("Ghi file 2 thanh cong");
	}
	
}

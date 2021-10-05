package Bai1;

public class MyThreadC extends Thread{
	
	FileTWrite f;
	MyThreadC(FileTWrite f){
		this.f=f;
	}
	public MyThreadC() {
		// TODO Auto-generated constructor stub
		f.write("3.txt");
		System.out.println("Ghi file 3 thanh cong");
	}
	
}

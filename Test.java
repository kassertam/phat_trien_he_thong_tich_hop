package Bai1;

public class Test {
	public static void main(String args[]) {
		FileTWrite obj= new FileTWrite();
		MyThreadA t1= new MyThreadA(obj);
		MyThreadA t2= new MyThreadA(obj);
		MyThreadA t3= new MyThreadA(obj);
		t1.start();
		t2.start();
		t3.start();
	}
}

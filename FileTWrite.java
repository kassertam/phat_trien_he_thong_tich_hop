package tuan3_Vidu;
import java.util.Random;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;

public class FileTWrite extends Thread {
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
try {
            
            for (int i=0; i<5; i++) {
            	
            	FileWriter fw = new FileWriter("D:\\study/testout.txt");
	            Random rd = new Random();
	            int number = rd.nextInt();
	            fw.write(number);
	            fw.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
	}
	
	public static void main(String args[]) {
		FileTWrite f1 = new FileTWrite();
		FileTWrite f2 = new FileTWrite();
		FileTWrite f3 = new FileTWrite();
        Thread fi1 = new Thread(f1);
        Thread fi2 = new Thread(f2);
        Thread fi3 = new Thread(f3);
        f1.start();
        f2.start();
        f3.start();
    }
}

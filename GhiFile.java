package Baitapthuchanh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
public class GhiFile extends Thread {
	public void run(){
    	try {
    		
    		    FileWriter writer = new FileWriter("D:\\text1.txt");
    	        BufferedWriter buffer = new BufferedWriter(writer);
    	        buffer.write("5 6 8 4 1 9 ");
    	        buffer.close();
    	        System.out.println("Success ...");
    	    }catch(Exception e) {
    	    		e.printStackTrace();
    	    	}
	}
	public static void main(String args[]) throws Exception {
		GhiFile gf1 = new GhiFile();
		GhiFile gf2 = new GhiFile();
		GhiFile gf3 = new GhiFile();
		
        gf1.start(); 
        GhiFile.sleep(1000);      
        gf2.start();
        GhiFile.sleep(1000);
        gf3.start();
    }

}
package Baitapthuchanh;

import java.io.BufferedReader;
import java.io.FileReader;

class DocFile extends Thread {
    public void run(){
    	try {
    	
    	 FileReader fr = new FileReader("D:\\test1.txt");
         BufferedReader br = new BufferedReader(fr);
         int i;
         while ((i = br.read()) != -1) {
             System.out.print((char) i);
         }
         br.close();
         fr.close();
         System.out.println("Success ...");
    	}catch(Exception e) {
			e.printStackTrace();
		}
    }
 
    public static void main(String args[]) throws Exception {
    	DocFile df1 = new DocFile();
    	DocFile df2 = new DocFile();
    	DocFile df3 = new DocFile();
    
        df1.start();
        DocFile.sleep(1000);
        df2.start();
        DocFile.sleep(1000);
        df3.start();
    }
}
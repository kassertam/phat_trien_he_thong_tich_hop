package Bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTWrite {
	void write(String name) {
		try {
			File myObj = new File(name);
			Scanner myWrite = new Scanner(myObj);
			while (myWrite.hasNextLine()) {
				String data = myWrite.nextLine();
				System.out.println("Number Array: " +data);
			}
			myWrite.close();	
		}catch (FileNotFoundException e) {
			System.out.println("Error occured.");
			e.printStackTrace();
		}
	}
	
}


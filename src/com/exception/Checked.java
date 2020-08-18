package com.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Checked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FileReader file = null;
		try {
			file = new FileReader("C:\\test\\a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	        BufferedReader fileInput = new BufferedReader(file); 
	          
	        // Print first 3 lines of file "C:\test\a.txt" 
	        for (int counter = 0; counter < 3; counter++)
				try {
					System.out.println(fileInput.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	          
	        try {
				fileInput.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 

	}

}

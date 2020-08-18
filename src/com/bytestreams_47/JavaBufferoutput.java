package com.bytestreams_47;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaBufferoutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 FileOutputStream fout = new FileOutputStream("C:\\Users\\0039\\Desktop\\textfiles\\hello.txt"); 
         
	        //creating bufferdOutputStream obj 
	        BufferedOutputStream bout = new BufferedOutputStream(fout); 
	  
	        //illustrating write() method 
	        for(int i = 65; i < 75; i++) 
	        { 
	            bout.write(i); 
	        } 
	          
	        byte b[] = { 75, 76, 77, 78, 79, 80 }; 
	        bout.write(b); 
	  
	        //illustrating flush() method 
	        bout.flush(); 
	          System.out.println("Success");
	        //illustrating close() method 
	        bout.close(); 
	        fout.close(); 
	}

}

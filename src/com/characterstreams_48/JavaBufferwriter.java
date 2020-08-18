package com.characterstreams_48;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JavaBufferwriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter geek_file;  
        try
        { 
            geek_file = new FileWriter("C:\\Users\\0039\\Desktop\\textfiles\\hello.txt"); 
              
            // Initialing BufferedWriter 
            BufferedWriter geekwrite = new BufferedWriter(geek_file); 
            System.out.println("Buffered Writer start writing :)"); 
              
            // Use of write() method to write the value in 'ABC' file 
            // Printing E 
            geekwrite.write(69);  
              
            // Printing 1 
            geekwrite.write(49);  
  
            // Closing BufferWriter to end operation 
            geekwrite.close(); 
            System.out.println("Written successfully"); 
        } 
        catch (IOException excpt) 
        { 
            excpt.printStackTrace(); 
        } 
  
	}

}

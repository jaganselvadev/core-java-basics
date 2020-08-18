package com.characterstreams_48;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int ch; 
		  
        // check if File exists or not 
        FileReader fr=null; 
        try
        { 
            fr = new FileReader("C:\\Users\\0039\\Desktop\\textfiles\\hello.txt"); 
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        } 
  
        // read from FileReader till the end of file 
        while ((ch=fr.read())!=-1) 
            System.out.print((char)ch); 
  
        // close the file 
        fr.close(); 
	}

}

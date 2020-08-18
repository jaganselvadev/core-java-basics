package com.file_46;

import java.io.File;

public class DirectoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Get the file 
        File f = new File("D:\\program"); 
  
        // Check if the specified path 
        // is a directory or not 
        if (f.isDirectory()) 
            System.out.println("Directory"); 
        else
            System.out.println("is not Directory"); 
	}

}

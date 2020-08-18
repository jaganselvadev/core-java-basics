package com.file_46;

import java.io.File;
import java.io.FilenameFilter;

public class Java_FilenameFilter {

		// TODO Auto-generated method stub
		  
	  //  private static final String FOLDER_PATH ="C:\\Users\\0039\\Desktop\\textfiles"; 
	 
	    public static void main(String[] args){
	    	File file = null;
	        String[] paths;
	    
	        try {      
	           // create new file object
	           file = new File("C:\\Users\\0039\\Desktop\\textfiles");

	           // array of files and directory
	           paths = file.list();

	           // for each name in the path array
	           for(String path:paths) {
	              // prints filename and directory name
	              System.out.println(path);
	           }
	        } catch (Exception e) {
	           // if any error occurs
	           e.printStackTrace();
	        }
	}

}

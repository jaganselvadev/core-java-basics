package com.exploring.io_45;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class JavaBufferinput   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try{    
			    FileInputStream fin=new FileInputStream("C:\\Users\\0039\\Desktop\\hello.txt");    
			    BufferedInputStream bin=new BufferedInputStream(fin);    
			    int i;    
			    while((i=bin.read())!=-1){    
			     System.out.print((char)i);    
			    }    
			    bin.close();    
			    fin.close();    
			  }catch(Exception e){System.out.println(e);}    
	}

}

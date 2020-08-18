package com.bytestreams_47;

import java.io.FileOutputStream;

public class JavaOutputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try{    
	             FileOutputStream fout=new FileOutputStream("C:\\Users\\0039\\Desktop\\textfiles\\java.txt");    
	             String s="Welcome to java.";    
	             byte b[]=s.getBytes();//converting string into byte array    
	             fout.write(b);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	}

}

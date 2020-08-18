package com.bytestreams_47;

import java.io.FileInputStream;

public class Fileinputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{    
	            FileInputStream fin=new FileInputStream("C:\\Users\\0039\\Desktop\\textfiles\\java.txt");    
	            int i=0;    
	            while((i=fin.read())!=-1){    
	             System.out.print((char)i);    
	            }       
	  
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}    
	}

}

package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{  
	 int id;  
	 String name;  
	 public Student(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }  
	}  
public class Objectoutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student s1 =new Student(211,"ravi");  
		  
		  FileOutputStream fout=new FileOutputStream("C:\\Users\\0039\\Desktop\\textfiles\\hello.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  
		  out.writeObject(s1);  
		  out.flush();  
		  System.out.println("success"); 
	}

}

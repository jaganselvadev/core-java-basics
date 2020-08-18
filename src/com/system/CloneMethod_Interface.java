package com.system;

public class CloneMethod_Interface implements Cloneable{

	int rollno;  
	String name;  
	  
	 CloneMethod_Interface(int rollno,String name){  
	this.rollno=rollno;  
	this.name=name;  
	}  
	  
	public Object clone()throws CloneNotSupportedException{  
	return super.clone();  
	}  
	  
	public static void main(String args[]){  
	try{  
		 CloneMethod_Interface s1=new  CloneMethod_Interface(101,"amit");  
	  
		 CloneMethod_Interface s2=( CloneMethod_Interface)s1.clone();  
	  
	System.out.println(s1.rollno+" "+s1.name);  
	System.out.println(s2.rollno+" "+s2.name);  
	  
	}catch(CloneNotSupportedException c){}  
	  
	}  

}

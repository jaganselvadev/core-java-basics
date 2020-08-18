package com.interfaces_accesscontrol;

 class A1{  
public void msg(){System.out.println("Hello");}  
}  
 
 
public class PublicAccessModifier {
	public static void main(String args[]){  
		   A1 obj = new A1();  
		   obj.msg();  
		  }  
}

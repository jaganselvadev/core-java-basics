package com.specialstringoperations;

public class Stringconcat {
 
	public static void main(String[] args) {
		 String s="Harish" + "Ramesh";
		 System.out.println(s);
		 
		 String s1="Harish";
		 String s2="Ramesh";
		 System.out.println(s1.concat(s2));  // Concatenates string2 to the end of string1. 
		 
		   String s4=50+30+"Sachin"+40+'c';  
		   System.out.println(s4);//80Sachin4040  
	}
}

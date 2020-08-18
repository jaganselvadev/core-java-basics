package com.classes;

public class ClassDog {
	
	String breed;
	   int age;
	   String color;

	   void barking(String a) {
      System.out.println(a);
	   }

	   void age(int b) { 
		   System.out.println(b);
	   }

	   void sleeping() {
	   }
	   public static void main(String[] args) {
		   ClassDog ob=new ClassDog();
		   ob.barking("Sound");
		   ob.age(3);
	}
	   
	   
}

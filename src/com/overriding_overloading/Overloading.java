package com.overriding_overloading;

public class Overloading {
 
	public void batsman(String a)    
	{
		System.out.println(a+" is a Opening Batsman");   
	}
	
	public void batsman(int a)
	{
		System.out.println("He crossed  " +a+ " runs in ODI.");
	}
	//Here we used same method name but different parameters this concept known as overloading
	
	public static void main(String[] args) {
		 
		Overloading ol=new Overloading();
		ol.batsman("Rohit");
		ol.batsman(8000);
		
	}
}

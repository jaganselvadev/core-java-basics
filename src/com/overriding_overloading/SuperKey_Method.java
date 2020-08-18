package com.overriding_overloading;

class School /* Base class */
{
	void show() 
    { 
        System.out.println("This is parent class"); 
    } }
class College extends School   /* Subclass  */
{
	
	void show()
	{	
		System.out.println("This is child class");
	}
	
	void display()
	{
		show();   // will invoke or call current class message() method 
		super.show();  // will invoke or call parent class message() method 
	}
}
public class SuperKey_Method {

	public static void main(String[] args) {
		 
		College c=new College();
		c.display();
	}
}


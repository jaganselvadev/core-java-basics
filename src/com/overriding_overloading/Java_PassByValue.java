package com.overriding_overloading;

public class Java_PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();          // object creation
		t.name="Harish";
		new Java_PassByValue().changeValue(t);   
		
		//When passing reference t to the function it will not directly pass the actual reference value of object test,
		//but it will create a copy of t and then pass it to the function.Since it is passing by value, 
		//it passes a copy of the variable rather than the actual reference of it.
		System.out.println(t.name); 
		
      // hence java is pass by value
	} 
	public void changeValue(Test f) {
		f.name="kesav";  // we put f=null here it throws nullpointer exception bcoz it only passes copy of reference
	}
}
class Test{
	String name;
}


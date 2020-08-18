package com.interfaces_accesscontrol;

interface ball{
	void match();      // this method must implemented with class
}
public class Bat implements ball{
	
  public void match() {
	  System.out.println("Cricket");       
  }
  // Interface can have only abstract methods. Abstract class can have abstract and non-abstract methods.
  public static void main(String[] args) {
	
	  Bat ob=new Bat();
	  ob.match();   
}
}

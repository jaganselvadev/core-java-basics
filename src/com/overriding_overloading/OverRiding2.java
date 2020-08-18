package com.overriding_overloading;

public class OverRiding2 extends OverRiding1{
  
	public void captain1(String b)
	{
		System.out.println("Indian ViceCaptain "+b);
	}
	public void captain(String c)     // overriding concept same method and parameter name in diff. classes achieved by inheritance
	//it rides the captain method in OverRiding1 class
	{
		System.out.println("Indian Cricket fav. Captain "+c);
	}
	public static void main(String[] args) {
		
		OverRiding2 or=new OverRiding2();
		or.captain("Dhoni");
		
		or.captain1("Rohit");
		
	}
}

package com.selectionstatements;

public class FallThrough_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number=20;  
		    //switch expression with int value  
		    switch(number){  
		    //switch cases without break statements  
		    case 10: System.out.println("10");  
		    case 20: System.out.println("20");  
		    case 30: System.out.println("30");  
		    default:System.out.println("Not in 10, 20 or 30");  
		    }  
	}

}
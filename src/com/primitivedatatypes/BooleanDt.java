package com.primitivedatatypes;

public class BooleanDt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 boolean b1;

		    b1 = false;
		    System.out.println("b1 is " + b1);
		    b1 = true;
		    System.out.println("b1 is " + b1);

		  // a boolean value can control the if statement
		    if(b1) System.out.println("This is executed.");

	        boolean b = false;
		    if(b)
		      System.out.println("Not executed.");

		 // outcome of relational operator is a boolean
		    System.out.println("100 > 90 is " + (100 > 90));
		  }
	

}

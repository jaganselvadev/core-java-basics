package com.variables;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		byte b = 42;  
        char c = 'a';  
        short s = 1024; 
        int i = 50000; 
        float f = 5.67f; 
        double d = 0.1234; 
          
        // The Expression 
        double result = (f * b) + (i / c) - (d * s);  // here a will be 97 ASCII value
         
        //Result after all the promotions are done 
        System.out.println("result = " + result); 
	}

}

package com.stringcomparison;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        
	        Boolean out = "Aalam".equals("aalam"); 
	        System.out.println("Checking Equality  " + out);
	        
	        out = "Aalam".equals("Aalam"); 
	        System.out.println("Checking Equality  " + out); 
	        
	        out="Aalam".equalsIgnoreCase("AalaM");
	        System.out.println("Checking Equality  " + out); 
	        
	}

}

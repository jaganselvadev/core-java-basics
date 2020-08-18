package com.characterextration;

public class Getchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome! to AalamInfo Tech"; 
		  
        char[] destArray = new char[20]; 
        try { 
            str.getChars(12, 26, destArray, 0); 
            System.out.println(destArray); 
        } 
        catch (Exception ex) { 
            System.out.println(ex); 
        } 
	}

}

package com.characterextration;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String s1 = "Welcome ";  
	        char[] ch = s1.toCharArray();  
	        int len = ch.length;  
	        System.out.println("Char Array length: " + len);  
	        System.out.println("Char Array elements: ");  
	        for (int i = 0; i < len; i++) {  
	            System.out.println(ch[i]);  
	        }  
	}

}

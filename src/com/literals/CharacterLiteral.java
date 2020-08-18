package com.literals;

public class CharacterLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //There are four ways in which we can specify char literals  
		
		// 1)Single Quote
		//       char ch='a';
		
	//	2) Char literal as Integral literal : 
		//char ch = 062;
		
		// 3) Unicode Representation :
		
        	//Here xxxx represents 4 hexadecimal numbers.
		
		//  char ch = '\u0061';// Here /u0061 represent a.
		
		// 4) Escape Sequence : Every escape character can be specify as char literals.
		// char ch="\"
		
		 char ch = 'a'; // signle character literl within signle quote 
	        char b = 062; // It is an Integer literal with octal form 
	        char c = '\u0061'; // Unicode representation 
	        System.out.println(ch); 
	        System.out.println(b); 
	        System.out.println(c); 
	        // Escape character literal 
	        System.out.println("\"  is a symbol"); 
		
	}

}

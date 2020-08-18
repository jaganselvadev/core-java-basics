package com.string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s= " Aalam Soft Solutions ";
        String s1="good";
     
        // Returns the number of characters in the String. 
        System.out.println("Length of the String " +s.length());
        
        // Returns the character at ith index. 
        System.out.println("Character at 5th position "+s.charAt(5));
        
     // Return the substring from the ith  index character 
        // to end of string 
        System.out.println("Substring " + s.substring(7)); 
        
     // Returns the substring from i to j-1 index. 
        System.out.println("Substring  = " + s.substring(5,9)); 
        
     // Concatenates string2 to the end of string1. 
        System.out.println("Concatenated string  = " + 
                s1.concat(s1)); 
        
     // Returns the index within the string of the 
        // first occurrence of the specified string, 
        // starting at the specified index. 
        System.out.println("Index of o  = " +  
                           s.indexOf('o',10)); 
        
        // Checking equality of Strings 
        Boolean out = "Aalam".equals("aalam"); 
        System.out.println("Checking Equality  " + out);
        
        out = "Aalam".equals("Aalam"); 
        System.out.println("Checking Equality  " + out); 
        
          s1.compareTo(s1); 
        System.out.println("If s1 = s " + out); 
        
     // Converting cases 
        
        System.out.println("Changing to lower Case " + 
                s1.toLowerCase()); 
        
        System.out.println("Changing to UPPER Case " +  
                s1.toUpperCase()); 
        // Trimming the word 
        System.out.println("Trim the word " + s.trim());
     // Replacing characters  
        s1.replace('d', 'o');
        System.out.println("Replaced g with o -> " + s); 
        
	}

}

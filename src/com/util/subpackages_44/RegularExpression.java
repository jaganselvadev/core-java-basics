package com.util.subpackages_44;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Create a pattern to be searched 
        Pattern pattern = Pattern.compile("or"); 
  
        // Search above pattern in "geeksforgeeks.org" 
        Matcher m = pattern.matcher("geeksforgeeks.org"); 
  
        // Print starting and ending indexes of the pattern 
        // in text 
        while (m.find()) 
            System.out.println("Pattern found from " + m.start() + 
                               " to " + (m.end()-1)); 
	}

}

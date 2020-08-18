package com.legacyclass_40;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Properties_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties gfg = new Properties(); 
        Set URL; 
        String str; 
          
        gfg.put("ide", "ide.geeksforgeeks.org"); 
        gfg.put("contribute", "contribute.geeksforgeeks.org"); 
        gfg.put("quiz", "quiz.geeksforgeeks.org"); 
          
        // checking what's in table 
        URL = gfg.keySet(); 
        Iterator itr = URL.iterator(); 
          
        while(itr.hasNext()) 
        { 
            str = (String)itr.next(); 
            System.out.println("The URL for " + str +  
                    " is " + gfg.getProperty(str)); 
        } 
          
        System.out.println(); 
          
        // looking for URL that not in list 
        str = gfg.getProperty("articl", "not found"); 
        System.out.println("The URL for article is " + str); 
	}

}

package com.simplegenerics;

import java.util.*;

public class GenericErasure {
	public static void main(String args[]) 
    { 
        List<String> list = new ArrayList<String>(); 
        list.add("Hello"); 
        list.add("Harish");
        Iterator<String> iter = list.iterator(); 
        while (iter.hasNext()) { 
            String s = iter.next(); 
            System.out.println(s); 
     } 
 
    } 
}

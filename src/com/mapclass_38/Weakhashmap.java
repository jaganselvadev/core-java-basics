package com.mapclass_38;

import java.util.Map;
import java.util.WeakHashMap;

public class Weakhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Number, String> weak = new WeakHashMap<Number, String>(); 
        weak.put(1, "geeks"); 
        weak.put(2, "for"); 
        weak.put(3, "geeks"); 
          
        // Checking weak map 
        System.out.println("our weak map: " + weak); 
          
        // Checking if "for" exist 
        if(weak.containsValue("for")) 
            System.out.println("for exist"); 
          
        // Checking if 1 exist as a key in map 
        if(weak.containsKey(1)) 
            System.out.println("1 exist"); 
          
        // Removing all data 
        weak.clear(); 
          
        // Checking whether map is empty or not 
        if(weak.isEmpty()) 
            System.out.println("empty map: " + weak); 
	}

}

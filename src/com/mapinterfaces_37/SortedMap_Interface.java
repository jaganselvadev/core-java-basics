package com.mapinterfaces_37;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<Integer, String> sm = 
                new TreeMap<Integer, String>(); 
    sm.put(new Integer(2), "practice"); 
    sm.put(new Integer(3), "quiz"); 
    sm.put(new Integer(5), "code"); 
    sm.put(new Integer(4), "contribute"); 
    sm.put(new Integer(1), "geeksforgeeks"); 
    Set s = sm.entrySet(); 

    // Using iterator in SortedMap 
    Iterator i = s.iterator(); 

    // Traversing map. Note that the traversal 
    // produced sorted (by keys) output . 
    while (i.hasNext()) 
    { 
        Map.Entry m = (Map.Entry)i.next(); 

        int key = (Integer)m.getKey(); 
        String value = (String)m.getValue(); 

        System.out.println("Key : " + key + 
                        "  value : " + value); 
    } 
	}

}

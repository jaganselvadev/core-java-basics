package com.mapclass_38;

import java.util.EnumMap;
import java.util.Map;

public class Enum {
	// create an enum  
	   public enum Days {  
	   Monday, Tuesday, Wednesday, Thursday  
	   };  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);  
		   map.put(Days.Monday, "1");  
		   map.put(Days.Tuesday, "2");  
		   map.put(Days.Wednesday, "3");  
		   map.put(Days.Thursday, "4");  
		   // print the map  
		   for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }   

	}

}

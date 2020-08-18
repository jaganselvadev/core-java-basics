package com.collection_classes;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {  
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
	}  
public class Test_Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);  
	    // Traversing elements  
	    Iterator<days> iter = set.iterator();  
	    while (iter.hasNext())  
	      System.out.println(iter.next());  
	}

}

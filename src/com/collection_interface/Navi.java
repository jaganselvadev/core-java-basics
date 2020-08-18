package com.collection_interface;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;
public class Navi {
	 public static void main(String[] args)  {
		 NavigableSet<String> setFruits = new TreeSet<>();
		 
		 setFruits.add("Banana");
		 setFruits.add("Apple");
		 setFruits.add("Orange");
		 setFruits.add("Grape");
		 setFruits.add("Mango");
		  
		 System.out.println("Set Fruits: " + setFruits);
		  
		 Iterator<String> descIterator = setFruits.descendingIterator();
		  
		 System.out.print("Fruits by descending order: ");
		  
		 while (descIterator.hasNext()) {
		     System.out.print(descIterator.next() + ", ");
		 }
	 }
	    
}

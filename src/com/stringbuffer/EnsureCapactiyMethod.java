package com.stringbuffer;

public class EnsureCapactiyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuffer buff1 = new StringBuffer("tuts point");
	      System.out.println("buffer1 = " + buff1);

	      // returns the current capacity of the string buffer 1
	      System.out.println("Old Capacity = " + buff1.capacity());
	      
	      /* increases the capacity, as needed, to the specified amount in the 
	         given string buffer object */
	      
	      // returns twice the capacity plus 2 
	      buff1.ensureCapacity(28); //  more than capacity value so it returns (capacity value*2)+2
	      System.out.println("New Capacity = " + buff1.capacity());

	      StringBuffer buff2 = new StringBuffer("compile online");
	      System.out.println("buffer2 = " + buff2);
	      
	      // returns the current capacity of string buffer 2
	      System.out.println("Old Capacity = " + buff2.capacity());
	      
	      /* returns the old capacity as the capacity ensured is less than 
	         the old capacity */
	      buff2.ensureCapacity(29);  //less  than capacity value so it returns same old capacity value
	      System.out.println("New Capacity = " + buff2.capacity());
	}

}

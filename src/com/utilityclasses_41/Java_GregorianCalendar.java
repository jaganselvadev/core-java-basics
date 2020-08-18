package com.utilityclasses_41;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Java_GregorianCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Creating an object of Calendar Class 
        Calendar cal = Calendar.getInstance(); 
  
        /* Creating an object of  
             GregorianCalendar Class */
        GregorianCalendar gcal = new GregorianCalendar(); 
  
        /* Displaying Current Date using 
             Calendar Class */
        System.out.println("Calendar date: "
                           + cal.getTime()); 
  
        /* Displaying Current Date using 
             GregorianCalendar Class */
        System.out.print("Gregorian date: "
                         + gcal.getTime()); 
	}

}

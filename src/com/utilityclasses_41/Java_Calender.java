package com.utilityclasses_41;

import java.util.Calendar;

public class Java_Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // creating Calendar object 
        Calendar calendar = Calendar.getInstance(); 
          
        // Demonstrate Calendar's get()method 
        System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR)); 
        System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE)); 
        System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE)); 
        System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND)); 
       
	}

}

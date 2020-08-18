package com.utilityclasses_41;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Java_Timezone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeZone timezone = TimeZone.getDefault(); 
		  
        // Get the Name of Time Zone 
        String LocalTimeZoneName = timezone.getDisplayName(); 
  
        // Initialize your Date Object and Date Format to represent your Date 
        Date date = new Date(); 
        DateFormat dformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
  
        // set your local time Zone to your Date Format time Zone 
        dformat.setTimeZone(timezone); 
  
        // Print Date and Time for your Time Zone 
        System.out.println("Date and time of your Local Time Zone:"); 
        System.out.println(LocalTimeZoneName + ", " + dformat.format(date)); 
    } 


	}



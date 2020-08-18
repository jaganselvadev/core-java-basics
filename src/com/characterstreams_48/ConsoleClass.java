package com.characterstreams_48;

import java.io.Console;

public class ConsoleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
        //Obtaining a reference to the console. 
        Console con = System.console(); 
          
        // Checking If there is no console available, then exit. 
        if(con == null)  
        { 
            System.out.print("No console available"); 
            return; 
        } 
          
        
	}

}

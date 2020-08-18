package com.scanner_43;

import java.util.Scanner;

public class Scanner_loop {

	public static void main(String[] args) {
		String str = "Germany are the champions";
        
        Scanner sc = new Scanner(str);       // LINE A
        
        // Check if sc has another token in the string
        while(sc.hasNext())
            System.out.println(sc.next());
        
        // Close the scanner
        sc.close();    
    } 
	}



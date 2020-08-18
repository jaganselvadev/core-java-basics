package com.operators;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner in = new Scanner(System.in);
        
        /* Input temperature in Celsius from user */
        System.out.print("Enter temperature in Celsius: ");
        float C = in.nextFloat();
        
        /* Convert Celsius to Fahrenheit */
        float F = C * (9 / 5) + 32;
        
        /* Print result */
        System.out.println(C + " degree Celsius is equal to " + F +" degree Fahrenheit.");
	}

}

package com.formatter_42;

import java.text.NumberFormat;
import java.util.Locale;

public class Number_Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double d = 123456.789; 
		    NumberFormat nf = NumberFormat.getInstance(Locale.ITALY); 
		    System.out.println("ITALY representation of " + d + " : "
		                                           + nf.format(d)); 
	}

}

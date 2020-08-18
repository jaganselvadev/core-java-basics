package com.scanner_43;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*  ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle",Locale.forLanguageTag("US"));
	//	ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", Locale.US);  
		  System.out.println("Message in "+Locale.US +":"+bundle.getString("greeting"));  
		  
		  //changing the default locale to indonasian   
		  Locale.setDefault(new Locale("in", "ID"));  
		  bundle = ResourceBundle.getBundle("MessageBundle");  
		  System.out.println("Message in "+Locale.getDefault()+":"+bundle.getString("greeting"));  
*/	
		  // create a new ResourceBundle with default locale
	      ResourceBundle bundle = ResourceBundle.getBundle("com.scanner_43.hello");

	      // print the text assigned to key "hello"
	      System.out.println(bundle.getString("hello"));	
	}

}

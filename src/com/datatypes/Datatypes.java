package com.datatypes;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte mybyte=127;                       // size =1 byte(8bits)
		System.out.println( "byte: " +mybyte); // range= -128 to 127
		
		short myshort=3;                    // size= 2byte
		System.out.println("short: "+myshort);  // range= -32768 to 32767
		 
		 // Integer data type is generally  
        // used for numeric values            
		int myint = 21;                			// size= 4byte
		System.out.println("int: "+myint);        // range= -2,147,483,648 to 2,147,483,647
		
		 // for long use 'l' as suffix 
		long mylong= 9223372036854775807l;			//size=8byte
		System.out.println("long: " +mylong);      // range=-9,223,372,036,854,775,808 to 9,223,372,036,854,775,808
		
		//declaring single character  
		char mychar='H';                           // size= 2byte
		System.out.println("char: "+mychar);
		
		 // for float use 'f' as suffix 
		float myfloat=34.5334f;                  // size= 4byte
		System.out.println("float: "+myfloat);    //range= Sufficient for storing 6 to 7 decimal digits
		
		  // by default fraction value is double in java 
		double mydouble=349.4598;                             //size=8byte
		System.out.println("double: " +mydouble);   // range= Sufficient for storing 15 decimal digits
		
		//boolean keyword can only take the values true or false
		//Boolean values are mostly used for conditional testing
		boolean istrue=true;                                        // size = 1 byte
		boolean isfalse=false;
		System.out.println("boolean: " +istrue+ "&" +isfalse);
		
		//non-primitive datatype
		String mystring="Hello World";
		System.out.println("String: "+mystring);
		
	
		
    
		
	}

}

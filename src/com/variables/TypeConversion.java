package com.variables;

public class TypeConversion {

	/*2 types of TypeConversion
	
	 a) Implicit conversion (byte->short->int-->long->float-->double)  process:widening
	 
     b) Explicit conversion(Type casting)   double-->float-->long-->int -->short -->byte   process:narrowing   */ 
    public static void main(String[] args) {
		
	
	int i = 100;
    long l = i;	//no explicit type casting required
    float f = l;	//no explicit type casting required
    
    System.out.println("Int value "+i);
    System.out.println("Long value "+l);
    System.out.println("Float value "+f);

    }
}

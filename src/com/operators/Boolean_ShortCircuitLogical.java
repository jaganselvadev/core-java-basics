package com.operators;

public class Boolean_ShortCircuitLogical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*A       B	    A | B	A & B	A ^ B	!A
		False	False	False	False	False	True
		True	False	True	False	True	False
		False	True	True	False	True	True
		True	True	True	True    False   False
		  */
		    boolean a = true;
		    boolean b = false;
	        boolean c = a | b;
	        boolean d = a & b;
	        boolean e = a ^ b;
	        boolean f = (!a & b) | (a & !b);
	        boolean g = !a;
			
	        System.out.println("            a = " + a);
	        System.out.println("            b = " + b);
	        System.out.println("          a|b = " + c);
	        System.out.println("          a&b = " + d);
	        System.out.println("          a^b = " + e);
	        System.out.println("(!a&b)|(a&!b) = " + f);
	        System.out.println("           !a = " + g);
	}

}
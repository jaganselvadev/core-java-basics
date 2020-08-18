package com.literals;

public class IntegerLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Integral literals in java
		//For Integral data types (byte, short, int, long), we can specify literals in 4 ways:-
		
				// 1) Decimal literals(Base 10) allowed digits are 0-9
			        	int x1 = 101;
			        	
			        	
			       // 2)Octal literals (Base 8) : In this form the allowed digits are 0-7.
			        	// The octal number should be prefix with 0.
			        	
			        	int x2=0100;
			        	//conversion bOctal to decimal
			        	//(1*8^2)+(0*8^1)+(0*8^0)
			        	// 64
			        	
			       // 3)Hexa-decimal literals (Base 16) : In this form the allowed digits are 0-9 and characters are a-f.
			        	// The hexa-decimal number should be prefix
			        	// with 0X or 0x.
			        	
			        	int x3=0XFace;
			        	
			        	//conversion binary to decimal
			      //  	Hexadecimal		F		A		C		E
			      //	Decimal	    	15		10		12		14
			      // 	Powers of 16	16^3	16^2	16^1	16^0
			      //	Multiplication	15*16^3	10*16^2	12*16^1	14*16^0
			      //    15*4096+10*256+12*16+14*1=  64206  	

			        	
			       //4) Binary literals :  

			        	int x4=0b1111;
			        	//conversion binary to decimal
			        //  2^7	2^6  2^5 2^4 2^3 2^2 2^1 2^0
			        //	128  64  32  16   8   4   2   1
			        //   0    0	  0   0   1   1   1   1
			        //   0*128 + 0*64 + 0*32 + 0*16 + 1*8 + 1*4 + 1*2 +1*1
			        //            8 + 4 + 2 + 1 = 15
			        	
			        	
			        	
			        	int a = 101; // decimal-form literal 
			            int b = 0100; // octal-form literal 
			            int c = 0xFace; // Hexa-decimal form literal 
			            int d = 0b1111; // Binary literal 
			            System.out.println(a); 
			            System.out.println(b); 
			            System.out.println(c); 
			            System.out.println(d); 
	}

}

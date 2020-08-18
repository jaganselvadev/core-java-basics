package com.utilityclasses_41;

import java.util.StringTokenizer;

public class Stringtokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("my name is Harish"," ");  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	     }  
	}

}

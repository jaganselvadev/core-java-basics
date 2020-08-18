package com.stringcomparison;

public class Starts_EndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("This is a test String");
	       String str2 = new String("Test ABC");
	       boolean var1 = str1.endsWith("String");
	       boolean var2 = str1.endsWith("ABC");
	       boolean var3 = str2.endsWith("String");
	       boolean var4 = str2.endsWith("ABC");
	       boolean var5=str1.startsWith("This");
	       boolean var6=str1.startsWith("his");
	       System.out.println("str1 ends with String: "+ var1);
	       System.out.println("str1 ends with ABC: "+ var2);
	       System.out.println("str2 ends with String: "+ var3);
	       System.out.println("str2 ends with ABC: "+ var4);
	       System.out.println("str2 starts with String: "+ var5);
	       System.out.println("str2 starts with ABC: "+ var6);
	}

}

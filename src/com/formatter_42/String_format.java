package com.formatter_42;

public class String_format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String s = String.format("{%.8s}", "Hello Format");

System.out.println(s);


String s1 = String.format ("{%05d}", 99);
System.out.print(s1);


	}

}

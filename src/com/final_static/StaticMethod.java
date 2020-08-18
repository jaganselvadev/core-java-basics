package com.final_static;

public class StaticMethod {

		  static int product(int x, int y) {
		   return x * y;
		  }
		  public static void main(String[] args) {
		   int ans =product(5, 3);  // without creation of object calling method bcoz its static method  
		   //if i call non-static method it comes compile error
		   System.out.println(ans);
		  }
		}



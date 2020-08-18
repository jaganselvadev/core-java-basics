package com.system;

public class Lang_Class {
	public static void main(String[] args) {
		

	 X x = new X();
     Y y = new Y();
     Class<?> clObj;  // LINE A
     clObj = x.getClass();
     System.out.println("X is object of class : " + clObj.getClass()); // LINE B
     /*if (clObj.equals(x))
     {
         System.out.println("clObj and x are the references of same class");
     } 
     else
     {
         System.out.println("clObj and x are the references of two different classes");
         System.out.println("clObj is a reference of " + clObj.getClass() + " and x is the reference of " + x.getClass());
     }*/
     clObj = y.getClass();
     System.out.println("Y is object of type : " + clObj.getName()); // LINE C
     clObj = clObj.getSuperclass();
     System.out.println("Y's Superclass is  " + clObj.getName()); // LILNE D    
 }
}

class X 
{
 int a;
 float b;
}

class Y extends X 
{
 double c;

}


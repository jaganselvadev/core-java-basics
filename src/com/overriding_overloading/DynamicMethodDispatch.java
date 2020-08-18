package com.overriding_overloading;

public class DynamicMethodDispatch {
	 public static void main(String arg[])
	    {
	        A1 a = new A1();
	        a.print();
	        
	        B1 b = new B1();
	        b.print();
	        
	        C1 c = new C1();
	        c.print();
	        
	        System.out.println("-----------------");
	        A1 a1 = b; // LINE A
	        System.out.println("After assigning B's object to A's reference and calling the print method on A's reference");
	        a1.print();
	        
	        System.out.println("-----------------");
	        B1 b1 = c; // LINE B
	        System.out.println("After assigning C's object to B's reference and calling the print method on B's reference");
	        b1.print();
	        
	        System.out.println("-----------------");
	        A1 a2 = c; // LINE C
	        System.out.println("After assigning C's object to A's reference and calling the print method on C's reference");
	        a2.print();
	        System.out.println("-----------------");    
	    }
	}

	class A1
	{
	    void print()
	    {
	        System.out.println("Print method in class A called");
	    }
	}

	class B1 extends A1
	{
	    void print()
	    {
	        System.out.println("Print method in class B called");
	    }
	}

	class C1 extends B1
	{
	    void print()
	    {
	        System.out.println("Print method in class C called");
	    }
}

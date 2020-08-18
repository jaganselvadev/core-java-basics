package com.abstractclass;

/* Rules for Abstract Class and Methods:-
 * An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
*/
	abstract class Base {  
		abstract void fun();  
		}  
		//In real scenario, implementation is provided by others i.e. unknown by end user  
		class Derived extends Base{  
		void fun(){System.out.println("fun method");}  
		}  
		
		//In real scenario, method is called by programmer or user  
		public class Abstract{  
		public static void main(String args[]){  
			 Base s=new Derived();//In a real scenario, object is provided through method, e.g., getShape() method  
		s.fun();  
		}  
}

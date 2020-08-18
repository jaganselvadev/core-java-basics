package com.variables;

public class JavaVariables {
  
	// In Java we have three types of variables
	
	// 1)Local Variable:
	/* A variable declared inside the body of the method is called local variable.
	You can use this variable only within that method. it  cannot be defined with "static" keyword.*/
	
	/* 2)Static Variable:
		A variable which is declared as static is called static variable. It cannot be local. 
		You can create a single copy of static variable and share among all the instances of the class.
		Memory allocation for static variable happens only once when the class is loaded in the memory.*/
	
	/* 3)Instace Variable:
		A variable declared inside the class but outside the body of the method, is called instance variable.
		It is not declared as static.*/
	
	int data=50;			//instance variable  
	static int m=100;		//static variable  
	
	void method(){  
	int n=90;				//local variable  
	}  
}

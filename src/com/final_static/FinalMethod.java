package com.final_static;

class FirstMethod{
	
	final void start(){
		System.out.println("initial");
	}
}
public class FinalMethod extends FirstMethod{
//oid start() {  // this part show compile time error because we mention final keyword in method name 
/*	System.out.println("final");
}*/
public static void main(String[] args) {
	FinalMethod ob=new FinalMethod();
	ob.start();
}
}

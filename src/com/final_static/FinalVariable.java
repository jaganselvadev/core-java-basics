package com.final_static;

public class FinalVariable {
  
	final int value=100;
	void change()
	{
		    //value=188; we cannot change the value one final keyword fixed with variable else it shows compile time error
	}
	public static void main(String[] args) {
		FinalVariable ob=new FinalVariable();
		//ob.value;
	}
}

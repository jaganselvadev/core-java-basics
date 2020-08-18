package com.iterationstatements;

public class WhileVsFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 5;
		for(int i = 1; i <= input; i++ )
		{
		    System.out.println(i);
		}
		//The same program using while.
		/*Use: 
			While loop is used in situations where we do not know how many times loop needs to be excuted beforehand.
			For loop is used where we already know about the number of times loop needs to be excuted. 
			Typically for a index used in iteration.*/
		
		int input1 = 5;
		int i = 1;
		while(i <= input1)
		{
		    System.out.println(i);
		    i++;
		}
	}

}

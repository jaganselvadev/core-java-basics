package com.iterationstatements;

public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 6;
        int sum = 0;
        
        for(int i = 1; i <= input; i++)
        {
            sum = sum + i;    // LINE A
            System.out.println("Sum after adding " + i + " is : " + sum); 
        }
        
        System.out.println();
	}

}

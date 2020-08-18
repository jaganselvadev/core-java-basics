package com.iterationstatements;

public class NestedWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, j=1; 
		System.out.println("Tables");

		while(i <= 1) // change to 2 to 10 or 20 as many tables user want
		{
		while(j <= 10)
		{
		System.out.println(i + " * " + j + " = " + (i*j));
		j++;
		}
		i++;
		System.out.println("");
		System.out.println("");
		}
	}

}

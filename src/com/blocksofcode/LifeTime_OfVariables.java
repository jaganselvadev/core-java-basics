package com.blocksofcode;

public class LifeTime_OfVariables {

	
		// TODO Auto-generated method stub
		
		int x,y; //instance variables access throughout the class except in static methods
		
		static int result; // class variables access throughout the class
		
		void add(int a,int b) //local variables access within blocks
		{
			x=a;
			y=b;
			int sum=x+y;
			System.out.println("Sum= "+sum);
		}
		public static void main(String[] args) {
			
			LifeTime_OfVariables ob=new LifeTime_OfVariables();
			ob.add(5, 8);
	}

}

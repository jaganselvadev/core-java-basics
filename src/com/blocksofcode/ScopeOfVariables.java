package com.blocksofcode;

public class ScopeOfVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i, y;
		    y = 20;
		    for (i = 0; i < 10; i++) { // the target of this loop is a block
		      System.out.println("This is i: " + i);
		      System.out.println("This is y: " + y);
		      y = y - 1;

		    }
	}

}

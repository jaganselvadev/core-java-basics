package com.blocksofcode;

public class BlocksCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
        x = 10;
        y = 20;
        if (x < y) { // begin a block
            x = y;
            y = 0;
            System.out.println("x=" + x);
            System.out.println("y=" + y);
        } // end of block
	}

}

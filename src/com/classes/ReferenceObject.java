package com.classes;

import java.awt.Point;

public class ReferenceObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point pt1, pt2;
		      pt1 = new Point(100, 100);
		      pt2 = pt1;
		      pt1.x = 200;
		    pt1.y = 200;
		   System.out.println("Point1: " + pt1.x + ", " + pt1.y);
		    System.out.println("Point2: " + pt2.x + ", " + pt2.y);
	}

}

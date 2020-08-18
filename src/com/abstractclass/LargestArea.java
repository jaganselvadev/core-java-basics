package com.abstractclass;

public class LargestArea {
	 public static void main(String arg[])
	    {
	        Shape shapes[] = new Shape[5];
	        
	        shapes[0] = new Rectangle(30.3, 45.4);
	        shapes[1] = new Circle(23.2);
	        shapes[2] = new Triangle(146.2, 40.0);
	        shapes[3] = new Rectangle(25, 57.8);
	        shapes[4] = new Triangle(120.0, 8.0);
	        
	        
	        Shape largest = shapes[0];
	        
	        for(int i = 0; i < shapes.length; i++)
	        {
	            if(shapes[i].getArea() > largest.getArea())
	            {
	                largest = shapes[i];
	            }
	        }
	        
	        System.out.println("The details of the shape with largest area are :" );
	        
	        largest.printDetails();    
	    }
	}

	abstract class Shape
	{
	    abstract double getArea();

	    abstract void printDetails();
	}

	class Rectangle extends Shape
	{
	    double length;
	    double breadth;

	    Rectangle(double length, double breadth)
	    {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    double getArea()
	    {
	        return length * breadth;
	    }

	    void printDetails()
	    {
	        System.out.println("Type = Rectangle");
	        System.out.println("Length = " + length);
	        System.out.println("Breadth = " + breadth);
	        System.out.println("Area = " + getArea());
	    }
	}

	class Circle extends Shape
	{
	    double radius;

	    Circle(double radius)
	    {
	        this.radius = radius;
	    }

	    double getArea()
	    {
	        return 3.14 * radius * radius;
	    }

	    void printDetails()
	    {
	        System.out.println("Type = Circle");
	        System.out.println("Radius = " + radius);
	        System.out.println("Area = " + getArea());
	    }
	}

	class Triangle extends Shape
	{
	    double base;
	    double height;

	    Triangle(double base, double height)
	    {
	        this.base = base;
	        this.height = height;
	    }

	    double getArea()
	    {
	        return base * height / 2.0;
	    }

	    void printDetails()
	    {
	        System.out.println("Type = Triangle");
	        System.out.println("Base = " + base);
	        System.out.println("Height = " + height);
	        System.out.println("Area = " + getArea());
	    }
}

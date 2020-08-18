package com.overriding_overloading;


class Football /* Base class */
{
	int audience=50000;
}
class Cricket extends Football   /* Subclass  */
{
	int audience=25000;
	
	void show()
	{
		 /* print maxaudience of base class (footaball) */
		
		System.out.println("Max audience: "+super.audience);
	}
}
public class SuperKey_Variable {

	public static void main(String[] args) {
		 
		Cricket big=new Cricket();
		big.show();
	}
}

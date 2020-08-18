package com.inheritance;

public class MultiMarutii800 extends MultiMaruti {
	
	 public MultiMarutii800()
	   {
		System.out.println("Maruti Model: 800");
	   }
	   public void speed()
	   {
		System.out.println("Max: 80Kmph");
	   }
	   public static void main(String args[])
	   {
		 MultiMarutii800 obj=new MultiMarutii800();
		 obj.vehicleType();
		 obj.brand();
		 obj.speed();
	   }
}

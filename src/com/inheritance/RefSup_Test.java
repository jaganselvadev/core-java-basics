package com.inheritance;

public class RefSup_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using superclass reference 
        // first approach 
       ReferenceSuperClass_Bicycle mb2 = new  ReferenceSuperClass_Bicycle(4, 200); 
          
        // using subclass reference( ) 
        // second approach 
        RefSup_MountainBike mb1 = new  RefSup_MountainBike(3, 100, 25); 
          
        System.out.println("seat height of first bicycle is " 
                                            + mb1.seatHeight); 
              
        // In case of overridden methods 
        // always subclass  
        // method will be executed 
        System.out.println(mb1.toString()); 
        System.out.println(mb2.toString()); 
  
	}

}

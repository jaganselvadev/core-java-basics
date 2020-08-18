package com.inheritance;

public class RefSup_MountainBike extends ReferenceSuperClass_Bicycle {
	  public int seatHeight; 
	  
	    // the MountainBike subclass has one constructor 
	    public  RefSup_MountainBike(int gear,int speed, 
	                        int startHeight) 
	    { 
	        // invoking base-class(Bicycle) constructor 
	        super(gear, speed); 
	        seatHeight = startHeight; 
	    }  
	          
	    // the MountainBike subclass adds one more method 
	    public void setHeight(int newValue) 
	    { 
	        seatHeight = newValue; 
	    }  
	      
	    // overriding toString() method 
	    // of Bicycle to print more info 
	    @Override
	    public String toString()  
	    { 
	          
	        return (super.toString()+ 
	                "\nseat height is "+seatHeight); 
	    } 
	      
}

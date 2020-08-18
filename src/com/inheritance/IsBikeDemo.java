package com.inheritance;

public class IsBikeDemo extends IsBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   IsPulsar myPulsar = new IsPulsar();
		   myPulsar.setColor("BLACK");

	        myPulsar.setMaxSpeed(136);

	        myPulsar.bikeInfo();
	       myPulsar.PulsarStartDemo();
	}

}

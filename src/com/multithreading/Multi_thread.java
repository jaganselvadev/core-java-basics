package com.multithreading;

 class Multi_threadDemo extends Thread {
	
	  public void run() 
	    { 
	        try
	        { 
	            // Displaying the thread that is running 
	            System.out.println ("Thread " + 
	                  Thread.currentThread().getId() + 
	                  " is running"); 
	  
	        } 
	        catch (Exception e) 
	        { 
	            // Throwing an exception 
	            System.out.println ("Exception is caught"); 
	        } 
	    } 
	
}

	// Main Class 
	public class Multi_thread 
	{ 
	    public static void main(String[] args) 
	    { 
	        int n = 8; // Number of threads 
	        for (int i=0; i<8; i++) 
	        { 
	            Multi_threadDemo object = new  Multi_threadDemo(); 
	            object.start(); 
	        } 
	    } 
	} 
	

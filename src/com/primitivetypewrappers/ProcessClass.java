package com.primitivetypewrappers;

public class ProcessClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try 
	        { 
	              
	            // create a new process 
	            System.out.println("Creating Process"); 
	              
	            ProcessBuilder builder = new ProcessBuilder("notepad.exe"); 
	            Process pro = builder.start(); 
	      
	            // wait 10 seconds 
	            System.out.println("Waiting"); 
	            Thread.sleep(10000); 
	      
	            // kill the process 
	            pro.destroy(); 
	            System.out.println("Process destroyed"); 
	      
	        }  
	            catch (Exception ex)  
	        { 
	            ex.printStackTrace(); 
	        } 
	}

}

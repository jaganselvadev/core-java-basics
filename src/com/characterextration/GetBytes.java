package com.characterextration;

public class GetBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String sl = "Hello Java" ; 
        byte[] txtArray = sl.getBytes(); 
        for( int i=0 ;i<txtArray.length; i++) 
           System.out.println("txtArray["+i+"] = " + txtArray[i]); 
	}

}

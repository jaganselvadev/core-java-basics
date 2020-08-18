package com.bytestreams_47;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//writing the data. 
        try ( DataOutputStream dout = 
                    new DataOutputStream(new FileOutputStream("C:\\Users\\0039\\Desktop\\textfiles\\java.txt")) ) 
        { 
            dout.writeDouble(1.1); 
            dout.writeInt(55); 
            dout.writeBoolean(true); 
            dout.writeChar('4'); 
        } 
          
        catch(FileNotFoundException ex) 
        { 
            System.out.println("Cannot Open the Output File"); 
            return; 
        } 
          
        // reading the data back. 
        try ( DataInputStream din = 
                    new DataInputStream(new FileInputStream("C:\\Users\\0039\\Desktop\\textfiles\\java.txt")) ) 
        { 
   
                         //illustrating readDouble() method 
            double a = din.readDouble(); 
                         //illustrating readInt() method 
            int b = din.readInt(); 
                         //illustrating readBoolean() method 
            boolean c = din.readBoolean(); 
                         //illustrating readChar() method 
            char d=din.readChar(); 
            System.out.println("Values: " + a + " " + b + " " + c+" " + d); 
        } 
        catch(FileNotFoundException e) 
        { 
            System.out.println("Cannot Open the Input File"); 
            return; 
        } 
	}

}

package com.bytestreams_47;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Bytearrayoutput {
	public static void main(String[] args) throws IOException 
    { 
        ByteArrayOutputStream geek_output = new ByteArrayOutputStream(); 
  
        byte[] buffer = {'J', 'A', 'V', 'A'}; 
  
        // Use of write(byte[] buffer, int offset, int maxlen) 
        geek_output.write(buffer, 0, 4); 
        System.out.print("Use of write(buffer, offset, maxlen) by toByteArray() : "); 
  
        // Use of toByteArray() : 
        for (byte b: geek_output.toByteArray()) 
        { 
            System.out.print(" " + b); 
        } 
    } 
}

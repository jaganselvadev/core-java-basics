package com.serialization;

import java.io.*;

public class ObjectinputStream {
public static void main(String[] args) {
	 try {  
         String str1 = "JavaTpoint";  
         FileOutputStream outstream = new FileOutputStream("C:\\Users\\0039\\Desktop\\textfiles\\Welcome.txt");  
         ObjectOutputStream objoutstream = new ObjectOutputStream(outstream);  
         objoutstream.writeObject(new WorkClass());  
         objoutstream.writeObject(str1);  
         objoutstream.flush();  
         ObjectInputStream objinstream = new ObjectInputStream(new FileInputStream("C:\\Users\\0039\\Desktop\\textfiles\\Welcome.txt"));  
         WorkClass  obj = (WorkClass) objinstream.readObject();  
         System.out.println("String in Serializable Class   : " + obj.str);  
         System.out.println("String in MainClass  :  " +str1);  
     } catch (Exception ex) {  
        ex.printStackTrace();  
     }  
  }  
 
  static class WorkClass implements Serializable {  
     String str = "Welcome to javaTpoint";  
     private String readObject(ObjectInputStream objin)   
        throws IOException, ClassNotFoundException {  
        ObjectInputStream.GetField g = objin.readFields();  
        return (String) g.get("str", null);  
     }  

}
}

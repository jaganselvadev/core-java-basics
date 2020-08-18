package com.stringbuffer;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//append method
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println("append: "+sb);//prints Hello Java  
		
		//insert method
		StringBuffer sb5=new StringBuffer("Hyy");  
sb5.insert(1, "Java");
		System.out.println("insert: "+sb5);//prints HJavayy
	
	//replace method
		StringBuffer sb1=new StringBuffer("Hello jas "); 
		sb1.replace(1,3,"Java");  
		System.out.println("replace: "+sb1);//prints HJavalo  jas 
		
		//delete method
		StringBuffer s=new StringBuffer("Harish");
		s.delete(1,3);  
		System.out.println("delete: "+s);//prints Hish  
		
		//reverse method
		StringBuffer sb2=new StringBuffer("Hai "); 
		sb2.reverse();  
		System.out.println("reverse: "+sb2);//prints olleH  
		
		//capactiy method
		System.out.println("capactiy: " +sb.capacity());
		
		//set charAt method
		sb.toString();
		sb.setCharAt(3, 'L');
		System.out.println("After setCharAt() String = " +sb.toString());
		
		//set length
		StringBuffer h=new StringBuffer("Hai Harish "); 
		h.setLength(9);
		System.out.println("set length: " + h.toString());
		
		//sub string
		System.out.println(h.substring(2, 7));
	}

}

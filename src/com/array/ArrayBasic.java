package com.array;

public class ArrayBasic {
   
	/*Array:An array is a collection of similar type of elements that have a contiguous memory location.
	
	1) Declaring Array
	<elementType>[] <arrayname>;
	
	2) Creation of Array 
	arrayname =new dataType[size] 

		Declaration and creation combined
		int intArray[] = new int[10]
					
	3)Initialize of Array
		int intArray[]= {1,2,3,4};*/
	public static void main(String args[]){  
		int a[]=new int[5];//declaration and instantiation  
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
		//traversing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]);  
	}}

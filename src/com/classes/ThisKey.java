package com.classes;

public class ThisKey {
	int a;
	int b;

	 public void setData(int a ,int b){
	  this.a =  a;
      this.b =b;
	 }
	 public void showData(){
	   System.out.println("Value of A ="+a);
	   System.out.println("Value of B ="+b);
	 }
	 public static void main(String args[]){
		 ThisKey obj = new ThisKey();
	   obj.setData(2,3);
	   obj.showData();
}
}

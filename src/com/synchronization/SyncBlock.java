package com.synchronization;

class Table1{  
	  
void printTable(int n){  
   synchronized(this){//synchronized block  
     for(int i=1;i<=3;i++){  
      System.out.println(n*i);  
      try{  
       Thread.sleep(600);  
      }catch(Exception e){System.out.println(e);}  
     }  
   }  
}//end of the method  
}  
  
public class SyncBlock {

	public static void main(String args[]){  
		final Table1 obj = new Table1();//only one object  
		  
		Thread t1=new Thread(){  
		public void run(){  
		obj.printTable(7);  
		}  
		};  
		Thread t2=new Thread(){  
		public void run(){  
		obj.printTable(20);  
		}  
		};  
		  
		t1.start();  
		t2.start();  
		}  
		}  


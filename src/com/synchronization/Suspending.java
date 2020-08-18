package com.synchronization;

public class Suspending extends Thread {

	public void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try  
            {  
                // thread to sleep for 500 milliseconds  
                 sleep(500);  
                 System.out.println(Thread.currentThread().getName());    
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        // creating three threads   
       Suspending t1=new Suspending ();    
       Suspending t2=new Suspending ();   
       Suspending t3=new Suspending ();   
        // call run() method   
        t1.start();  
        t2.start();  
        // suspend t2 thread   
        t2.suspend();   //suspend()	This method is used to suspend all threads in the thread group.
        // call run() method   
        t3.start();  
    }    
}

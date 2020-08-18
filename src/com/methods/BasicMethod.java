package com.methods;

public class BasicMethod {

	/*In general, method declarations has six components :
		i) Access Modifier --> public
 		ii) Return type --> int
        iii) Method name --> max
		iv) Parameter list -->( int x,int y)
		v)Method body     -->{    }
		vi)Method signature --> max(int x,int y)    */  
	
	public int max(int x,int y)   
	{
		if(x>y)
			return x;
		else
			return y;
		
	}
public static void main(String[] args) {
	BasicMethod add=new BasicMethod();
	int s=add.max(3, 7);
System.out.println("max value "+s);
}

}

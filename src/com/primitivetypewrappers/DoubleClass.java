package com.primitivetypewrappers;

public class DoubleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double b = 55.05; 
	        String bb = "45"; 
	  
	        // Construct two Double objects 
	        Double x = new Double(b); 
	        Double y = new Double(bb); 
	  
	        // toString() 
	        System.out.println("toString(b) = " + Double.toString(b)); 
	  
	        // valueOf() 
	        // return Double object 
	        Double z = Double.valueOf(b); 
	        System.out.println("valueOf(b) = " + z); 
	        z = Double.valueOf(bb); 
	        System.out.println("ValueOf(bb) = " + z); 
	  
	        // parseDouble() 
	        // return primitive double value 
	        double zz = Double.parseDouble(bb); 
	        System.out.println("parseDouble(bb) = " + zz); 
	  
	        System.out.println("bytevalue(x) = " + x.byteValue()); 
	        System.out.println("shortvalue(x) = " + x.shortValue()); 
	        System.out.println("intvalue(x) = " + x.intValue()); 
	        System.out.println("longvalue(x) = " + x.longValue()); 
	        System.out.println("doublevalue(x) = " + x.doubleValue()); 
	        System.out.println("floatvalue(x) = " + x.floatValue()); 
	  
	        int hash = x.hashCode(); 
	        System.out.println("hashcode(x) = " + hash); 
	  
	        boolean eq = x.equals(y); 
	        System.out.println("x.equals(y) = " + eq); 
	  
	        int e = Double.compare(x, y); 
	        System.out.println("compare(x,y) = " + e); 
	  
	        int f = x.compareTo(y); 
	        System.out.println("x.compareTo(y) = " + f); 
	  
	        Double d = Double.valueOf("1010.54789654123654"); 
	        System.out.println("isNaN(d) = " + d.isNaN()); 
	  
	        System.out.println("Double.isNaN(45.12452) = " + Double.isNaN(45.12452)); 
	  
	        // Double.POSITIVE_INFINITY stores 
	        // the positive infinite value 
	        d = Double.valueOf(Double.POSITIVE_INFINITY + 1); 
	        System.out.println("Double.isInfinite(d) = " +  
	                                    Double.isInfinite(d.doubleValue())); 
	  
	        double dd = 10245.21452; 
	        System.out.println("Double.toString(dd) = " + Double.toHexString(dd)); 
	  
	        long double_to_long = Double.doubleToLongBits(dd); 
	        System.out.println("Double.doubleToLongBits(dd) = " + double_to_long); 
	  
	        double long_to_double = Double.longBitsToDouble(double_to_long); 
	        System.out.println("Double.LongBitsToDouble(double_to_long) = " +  
	                                    long_to_double); 
	}

}

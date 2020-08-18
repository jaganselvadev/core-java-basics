package com.overriding_overloading;

public class RemoveDuplicateCode {
	
//	class IcecreamPrices
//	{
    public static void main(String arg[])
	    {
	        IceCream ic = new IceCream();
	        ic.flavor = "Pista";
	        ic.numberOfScoops = 2;
	        
	        System.out.println(ic.numberOfScoops + " scoops of " + ic.flavor + " flavor price is : " + ic.getIceCreamPrice());
	        
	        FruitSaladWithIceCream fs = new FruitSaladWithIceCream();
	        fs.flavor = "Chocolate";
	        fs.numberOfScoops = 1;
	        fs.gramsOfFruitSalad = 50;
	        
	        System.out.print(fs.gramsOfFruitSalad + " grams of fruit salad and ");
	        System.out.println(fs.numberOfScoops + " scoops of " + fs.flavor + " flavor price is : " + fs.getFruitSaladWithIceCreamPrice());
	        
	        KhubaniKaMeetaWithIceCream kkm = new KhubaniKaMeetaWithIceCream();
	        kkm.flavor = "Vanila";
	        kkm.numberOfScoops = 1;
	        kkm.gramsOfKhubaniKaMeeta = 75;
	        
	        System.out.print(kkm.gramsOfKhubaniKaMeeta + " grams of khubani ka meeta and ");
	        System.out.println(kkm.numberOfScoops + " scoops of " + kkm.flavor + " flavor price is : " + kkm.getKhubaniKaMeetaWithIceCreamPrice());
	    
	    }
	}

	class IceCream
	{
	    String flavor;
	    int numberOfScoops;
	    
	    double getIceCreamPrice()
	    {
	        double pricePerScoop = 35.0;
	        return numberOfScoops * pricePerScoop;
	    }
	}

	class FruitSaladWithIceCream extends IceCream
	{
	    int gramsOfFruitSalad;

	    double getFruitSaladWithIceCreamPrice()
	    {
	        double iceCreamPrice = getIceCreamPrice();
	        double pricePerGram = 0.75;

	        return gramsOfFruitSalad * pricePerGram + iceCreamPrice;
	    }
	}

	class KhubaniKaMeetaWithIceCream extends IceCream
	{
	    int gramsOfKhubaniKaMeeta;

	    double getKhubaniKaMeetaWithIceCreamPrice()
	    {
	        double iceCreamPrice = getIceCreamPrice();
	        double pricePerGram = 1.25;

	        return gramsOfKhubaniKaMeeta * pricePerGram + iceCreamPrice;
	    }
	}



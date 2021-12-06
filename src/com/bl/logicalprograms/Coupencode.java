package com.bl.logicalprograms;

public class Coupencode {
	public static void main(String[] args)
	{
		char[] chars = "abcdefghijlmnopqrast0123456789ABCDEFGHIJLMNOPQRSTUVWXYZ".toCharArray();
		int max = 100000000;
		
		double r = Math.random();
		int random = (int)(r*max);
		String st = "";
	//	System.out.println("Random"+" "+r+" "+"Strat at"+" "+random);
		
		while(random>0) 
		{
			st = st+(chars[random%chars.length]);
	//		System.out.println(st);
			random /= chars.length;
	//		System.out.println(random);
			
		}
		
		System.out.println("Coupencode:"+" "+st);
	}
}

package com.bl.logicalprograms;

import java.util.Scanner;

public class Fibonacciseries {
	
	public static void main(String[] args) {
		System.out.println("How many fibonacci elemnets to print?");
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.close();
		
		int prev = 0;
		int current = 1;
		
		if(count>1) 
		{
			System.out.print(prev+"\t"+current+"\t");
			for(int i = 2; i < count ;i++) 
			{
				int temp = Fibonacciseries.nxtelemnt(prev, current);
				prev = current;
				current = temp;
				System.out.print(current+"\t");
				
			}
		}else 
		{
			System.out.println("invalid Inputs");
		}
	}
	
	public static int nxtelemnt(int prev, int current ) 
	{
		return (prev+current);
	}
}

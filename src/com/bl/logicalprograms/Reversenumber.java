package com.bl.logicalprograms;

import java.util.Scanner;

public class Reversenumber {
	  public static void main(String[] args) {
		  
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a Number : ");
	        int i = sc.nextInt();
	        int reverse = 0;
	        
	        while (i != 0) 
	        {
	            int remainder = i % 10;
	            reverse = reverse * 10 + remainder;
	            i = i / 10;
	        }
	        
	        System.out.println("The reverse of the given number is: " + reverse);
	        sc.close();
	    }
}

package com.bl.Junit;

import java.util.Scanner;

public class Temp_conver {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
			System.out.println("Please select any one ");
			System.out.println("1.Celsius to Fahrenheit ");
			System.out.println("2.Fahrenheit to Celcious ");
			System.out.println("\n");
			System.out.println("Enter the option ");
			int op = sc.nextInt();
			switch(op) 
			{
			case 1 :
				System.out.println("Enter the celcious value");
				double c = sc.nextDouble();
				double F = (c*9/5)+32;
				System.out.println("Celsius to Fahrenheit : "+" "+F+" "+"F");
				break;
				
			case 2 :
				System.out.println("Enter the fahrenheit value");
				double f = sc.nextDouble();
				double C = (f-32)*5/9;
				System.out.println("Fahrenheit to Celcious :"+" "+C+" "+"C");
				break;
				
				default :
					System.out.println("Please enter the valid input");
			}
			sc.close();
	}
	
}

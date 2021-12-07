package com.bl.Junit;

import java.util.Scanner;

public class Newtonmethod {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		double c = sc.nextDouble();
		sc.close();
		
		
        double epsilon = 1.0e-15;  
        double t = c;              

        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }

        System.out.println(t);
    }
	}


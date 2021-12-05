package com.bl.logicalprograms;

import java.util.Scanner;

public class Primenumber {
	public static int in;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The number");
		 in = sc.nextInt();
		sc.close();
		Isprime();
	}
	
	public static void Isprime() {
		boolean flag = false;
        for (int i = 2; i <= in / 2; ++i) {
            // condition for non-prime number
            if (in % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(in + " is a prime number.");
        else
            System.out.println(in + " is not a prime number.");
    }
}

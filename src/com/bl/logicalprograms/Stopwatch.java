package com.bl.logicalprograms;

import java.util.Scanner;

public class Stopwatch {
	public static void main(String[] args)
	{
		Stopwatch stopwatch = new Stopwatch();
		stopwatch.stopwatch();
	}
	
	public void stopwatch() 
	{
		Scanner sc = new Scanner(System.in);
		long start = 0 ,stop = 0;
		
		System.out.println("Press the \"Enter\"  key twice two measure the time difference ");
		
		String in = sc.nextLine();
		
		if(in.isEmpty()) 
		{
			start = System.currentTimeMillis();
			System.out.println("Starting at :"+" "+start);
		}
		
		in = sc.nextLine();
		
		if(in.isEmpty()) 
		{
			stop = System.currentTimeMillis();
			System.out.println("Stop :"+" "+stop);
		}
		
		sc.close();
		
		int elapsedtimed = (int) (stop-start);
		System.out.println("Elapsed time is :"+elapsedtimed);
		
	}
}

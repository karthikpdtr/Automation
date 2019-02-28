package com.loops;

import java.util.Scanner;

public class While {

	public static void main(String[] args)
	{
	
		Scanner s=new Scanner(System.in);

		int n=0, times=0;

		System.out.print("Enter number :");

		 n=s.nextInt();

		System.out.print("Enter number of times :");

		 times=s.nextInt();

		while(n<times)
		{
		  System.out.println("Java While Loops:"+n);
		   n++;
		}


	}

}

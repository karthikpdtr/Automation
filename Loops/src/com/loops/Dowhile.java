package com.loops;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		    int n=0, times=0;

		System.out.print("Enter n value  :");
		    n=s.nextInt();

		System.out.print("Enter number of times value :");
		    times=s.nextInt();

	          do
	          {
	             System.out.println("Java While Loops:"+n);
			     n++;
	          } while(n<=times);
		

	}

}

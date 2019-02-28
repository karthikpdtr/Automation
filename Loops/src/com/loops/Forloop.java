package com.loops;

import java.util.Scanner;

public class Forloop 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	    int n=0, times=0;

	    System.out.print("Enter n value  :");
	    n=s.nextInt();

	    System.out.print("Enter number of times value :");
	    times=s.nextInt();
    
	    for(n=0;n<=times;n=n+1)
	    {
	       System.out.println("Java for Loops :"+n);
	    }	

	}

}

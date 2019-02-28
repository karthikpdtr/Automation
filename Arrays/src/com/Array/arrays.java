package com.Array;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) 
	{
		
	 Scanner s=new Scanner(System.in);
	 
	  int n, sum=0;
	  
	  System.out.print("Enter the no of elements you  want in arrays :");
	  
	   n=s.nextInt();
	   
	   int a[]=new int[n];
		
	  System.out.println("Enter all the elements :");
		
		for(int i=0; i < a.length; i++) 
		
		{
			System.out.print("a["+i+"]=");
			a[i]=s.nextInt();
			sum=sum+a[i];
			
		}
			
		
		System.out.println("Sum :"+sum);
		
		
		}
			
	}


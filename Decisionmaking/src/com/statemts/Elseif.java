package com.statemts;

import java.util.Scanner;

public class Elseif 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);

		  int a = 0,b = 0;

		  System.out.print("Enter A value :"+a);

		   a=s.nextInt();
		  
		  System.out.print("Enter B value :"+b);
		  
		   b=s.nextInt();

		    if(a>b)
	        {
		      System.out.print("A is Greater");	
	        }
	        else if(b>a)
	        {
	           System.out.print("B is Greater");
	        }
	        else
	        {
	           System.out.println("Both are Equal");
	        }
		        	
	  }

}

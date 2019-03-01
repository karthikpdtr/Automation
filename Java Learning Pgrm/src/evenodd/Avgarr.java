package evenodd;

import java.util.Scanner;

public class Avgarr 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);

		   System.out.print("Enter Array Size :");
		  
		   int n=s.nextInt();

		   double[] arr=new double[n];

		   double total =0;
		   
		   for(int i=0;i<arr.length;i++)
		   {
			   System.out.print("Enter Element No "+(i+1)+": ");
			   arr[i] = s.nextDouble();
		   }
		   s.close();
		   for(int i=0;i<arr.length;i++)
		  {

		    total=total+arr[i];

		   }

		     double average=total/arr.length;

		     System.out.println("The average of numbers is :"+average);
		     
		     


	}

}

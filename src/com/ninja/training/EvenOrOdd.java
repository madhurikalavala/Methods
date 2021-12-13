package com.ninja.training;

import java.util.Scanner;

public class  EvenOrOdd 
{
	public static boolean EvenOrOdd(int n)
	{
        
			return (n%2==0);
		
	}//end of method
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number");
		int num=input.nextInt();
		if(EvenOrOdd(num))
		{System.out.println("Entered number"+num+" is even");
		
		}//end of if
	
		else
		{System.out.println("Entered number"+num+" is odd");
		}//end of else
		input.close();
		

	}//end of main

}//end of class

package com.ninja.training;

public class Largestnumbr {
	public static int bignumbr(int a[], int len) 
	{
	
		for(int i=0;i<len; i++)
	{
		for(int j=i+1;j<len;j++)
		{
			
			if(a[i]>a[j])
				{
			int	temp=a[i];
			a[i]=a[j];
			a[j]=temp;
				}//end of if
			
		}//end of j loop
	}//end of i forloop
		return a[len-1];
	}//end of method
	

	public static void main(String[] args) {
		int a[]= {40,100,602,20,27,32,120,9};
		System.out.println("largest number is"+bignumbr(a,8));
		

	}//end of main

}//end of class

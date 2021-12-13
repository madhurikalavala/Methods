package com.ninja.training;
import java.util.Scanner;


public class Palindrome {
	public static boolean pln(String org )
	{   
		
		StringBuffer s = new StringBuffer(org);
		s.reverse();
		String rev = s.toString();
		System.out.println("The value of reversed string: " +rev);
		
		return (org.equals(rev));

	
			
	}//end of method

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter name");
		String  n=input.next();
		
		if(pln(n))
		{System.out.println("Entered name"+n+"  is palindrome ");}
		else {System.out.println("entered name "+n+"is not palindrome");}
	}

}

package com.tns.core;

import java.util.Scanner;

class Palindrome {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number:-");
		String reverse="";
		String num=s.nextLine();
		int length = num.length();
		for(int i=length-1;i>=0;i--)
			reverse=reverse+num.charAt(i);
		
		if(num.equals(reverse))
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}

	}

}

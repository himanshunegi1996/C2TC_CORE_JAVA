package com.tns.core;

import java.util.Scanner;
import java.util.*;

public class Palindrome1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=s.nextInt();
		int r,sum=0;
		int temp=num;
		while(num>0)
			{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			}
		if(temp==sum)
		
			System.out.println("Number is Palindrome");
		
		else
		
			System.out.println("Number is not Palindrome");
		

	}

}

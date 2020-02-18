package com.sth.puzzle;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class NumberOfDigitsInNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the no");
		long temp = input.nextLong();
		long n=temp;
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		
		System.out.println("Input number have "+ count +" digits using while loop");
		
		System.out.println("Input number have "+ recursiveMethod(temp) + " digits using recursive method");
		
		System.out.println("Input number have "+ Math.floor(Math.log10(temp)+1) + " digits using logarithmic method");
		
	}
	
	public static long recursiveMethod(long n) {
		
		if(n==0) {
			return 0;
		}
		return 1+ recursiveMethod(n/10);
	}

}

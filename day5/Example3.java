package com.day5;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		//try{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=s.nextInt();
		System.out.println("Enter second number");
		int b=s.nextInt();
		int c=a/b;
		System.out.println(c);
		}
		//catch(ArithmeticException e) {
		//	System.out.println("You cant divide by 0");
		//}

	//}

}

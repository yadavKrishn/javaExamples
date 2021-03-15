package com.handson_day5;

import java.util.Scanner;

class MyException extends Exception{
	 public MyException(String str) {
		  System.out.println(str);
		 }

}
public class AgeException {

	public static void main(String[] args) {
			  Scanner sc = new Scanner(System.in);
			  System.out.print("Enter the name of player ");
			  String str = sc.nextLine();
			  Scanner s = new Scanner(System.in);
			  System.out.print("Enter age ");
			  int age = s.nextInt();
			  try {
			   if(age < 19) 
			    throw new MyException("CustomException: InvalidAgeRangeException");
			   else {
				   System.out.println("Player Name:"+str);
				   System.out.println("Age:"+age);
			   }
			  }
			  catch (MyException e) {
			   System.out.println(e);
			  }
			 }	

}

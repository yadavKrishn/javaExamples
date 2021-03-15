package com.handson_day5;

import java.util.Scanner;
class UserMaincode1{
	static boolean validateCity(String str) {
		int len=str.length(),flag=0;
		
		boolean f1=Character.isLetter(str.charAt(0)); 
		boolean f2=Character.isLetter(str.charAt(1));
		boolean l1=Character.isLetter(str.charAt(len-1));
		boolean l2=Character.isLetter(str.charAt(len-2));
		
		for(int j=2;j<(len-2);j++){
			if(str.charAt(j) != '*') {
				flag += 1;
			}
		}
		if(f1 == true && f2 == true && flag == 0 && l1 == true && l2 == true)
		{
			System.out.println("valid");
			return true;
		}
		else
		{
			System.out.println("invalid");
			return false;
		}
						
	}
}

	

public class Problem2 {

	public static void main(String[] args) {
		System.out.println("Enter City Name ");
		Scanner sc =new Scanner(System.in);
				String str=sc.nextLine();
				UserMaincode1.validateCity(str);
		
	}

}

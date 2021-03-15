package com.handson_day5;

import java.util.Scanner;

public class ArrayException {

	public static void main(String[] args) {
		    try {
			int n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of Overs");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter the runs for Each Over");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        System.out.println("Enter the Over no.");
	        Scanner s1 = new Scanner(System.in);
	        int o=s1.nextInt();
	        System.out.println("Run scored in this over:"+a[o-1]);
	        	
	        }
		    catch(Exception e) {
		    	System.out.println(e);
		    }

	}

}

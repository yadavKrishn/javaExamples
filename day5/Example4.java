package com.day5;

public class Example4 {

	public static void main(String[] args) {
		try {
			int a=args.length;
			System.out.println(a);
			int b=10/a;
			int c[]= {1};
			//c[50]=99;
			int d=Integer.parseInt("abcd");
			System.out.println(d);
		}
		catch(ArithmeticException e) {
			System.out.println(e);//java.lang.AE
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

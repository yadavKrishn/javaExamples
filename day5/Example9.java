package com.day5;

public class Example9 {
	static void withdraw(int balance, int amount) {
		try{
			assert balance>amount;
		    System.out.println(balance-amount);
	}
		catch(AssertionError e) {
			System.out.println("Balance is not greater than amount");
		}
	}
	public static void main(String[] args) {
		
		withdraw(1000,500);
		withdraw(1000,2000);
	}

}

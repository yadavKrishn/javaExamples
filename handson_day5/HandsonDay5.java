package com.handson_day5;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

	class UserMainCode{
		public static boolean validDate(String strdate) {
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			Date BOD = null;
			df.setLenient(false);
			try {
				BOD = df.parse(strdate);
				System.out.println("valid");
				return true;
			}
			catch(Exception e) {
				System.out.println("invalid");
				return false;
			}
		}
	}
	public class HandsonDay5 {
		public static void main(String[] args) {
			System.out.println("Enter Date as DD-MM-YYYY");
			Scanner sc =new Scanner(System.in);
			String date=sc.nextLine();
			
			UserMainCode.validDate(date);

		}

		

}

	
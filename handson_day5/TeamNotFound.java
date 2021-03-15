package com.handson_day5;

import java.util.Scanner;

class TeamNotFoundException extends Exception{
	TeamNotFoundException(String s){  
	 super(s);  
	}  
}

public class TeamNotFound {
	static void check(String teamName) throws TeamNotFoundException{ 
		String[] teamList = new String[]{ "Chennai Super Kings","Deccan Chargers","Delhi Daredevils","Kings XI Punjab",
				"Kolkata Knight Riders","Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore"};
		boolean flag=true; 
		for (String element : teamList) { 
            if (element.equals(teamName)) { 
            	flag=false;
            	
            }
            else {
            	flag=true;
            }
        } 
		
		if(flag)
		{
			throw new TeamNotFoundException("Entered team is not a part of IPL Season 4");
		}
		
	}

	public static void main(String[] args) {
		try{  
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the expected winner team of IPL Season 4 :");
			String teamWinner = sc.nextLine();
			System.out.println("Enter the expected runner Team of IPL Season 4 :");
			String teamRunner = sc.nextLine();
			check(teamWinner);
		    System.out.println("Expected IPL Season 4 winner:" + teamWinner);
		    check(teamRunner);
			System.out.println("Expected IPL Season 4 runner:" + teamRunner);
		}
		catch(Exception e){
			System.out.println(e);
		}  
		

	}

}

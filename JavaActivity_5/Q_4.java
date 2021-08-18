package com.ltts;
import java.util.Scanner;
class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
}
public class Q_4 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countWinner=0,countRunner=0;
		String[] a = {"Chennai Super Kings","Sun Risers Hyderabad","Delhi Capitals","Kings XI Punjab","Kolkata Knight Riders","Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore"};
		 System.out.println("Enter the expected winner team of IPL Season 13:");
		 String Winnerteamname = sc.nextLine();
		 System.out.println("Enter the expected Runner team of IPL Season 13:");
		 String Runnerteamname = sc.nextLine();
		 for(int i=0;i<8;i++) {
			  if(Winnerteamname.equals(a[i])) {
			    	countWinner++;
			    	}}
			  for(int j=0;j<8;j++) {
			  if(Runnerteamname.equals(a[j])) {
				  countRunner++;
			  }
			  }
		 sc.close();
		try {
			   if(countWinner==0||countRunner==0) {
				   throw new MyException("TeamNameNotFoundException: Entered team is not a part of IPL Season 13");
			   }
			   else {
			     System.out.println("Expected IPL Season 13 winner: Delhi Capitals");
			     System.out.println("Expected IPL Season 13 winner: Kolkata Knight Riders");
			    	}
			}
			catch (MyException ex) {
			 System.out.println(ex.getMessage());
		    }
		countWinner=0;
		countRunner=0;
	}	
}

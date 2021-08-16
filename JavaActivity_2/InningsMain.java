package com.ltts;

import java.util.Scanner;
class Innings {
	private String teamname;
	private String inningsnames;
	private int runs;
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getInningsnames() {
		return inningsnames;
	}
	public void setInningsnames(String inningsnames) {
		this.inningsnames = inningsnames;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public void displayInningsDetails() {
		System.out.println("Name:"+getTeamname());
		System.out.println("Scored:"+getRuns());
		if(inningsnames.equals("First")) {
			System.out.println("Need"+" "+(runs+1)+" " +"to win");
			}
		else {
			System.out.println("Match Ended.");
		}
		
	}

}

public class InningsMain {
	public static void main (String args[]) {
  	  Innings i = new Innings();
  	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the TeamName:");
	  i.setTeamname(sc.next());
	  System.out.println("Enter the Session:");
	  i.setInningsnames(sc.next());
	  System.out.println("Enter Runs:");
	  i.setRuns(sc.nextInt());
	  sc.close();
	  i.displayInningsDetails();
    }

}

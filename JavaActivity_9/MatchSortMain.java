package com.ltts;
import java.util.*;
class Match implements Comparable<Match>{
	private String teamOne;
	private String teamTwo; 
	private String matchDate;
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	public String getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}
	
	@Override
	public String toString() {
		return "teamOne=" + teamOne + " " +
		     	"teamTwo=" + teamTwo + " " +
		     	"matchDate=" + matchDate + " ";
	}
	public Match(String teamOne, String teamTwo, String matchDate) {
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.matchDate = matchDate;
	}
	@Override
	public int compareTo(Match o) {
		 return o.matchDate.compareTo( this.matchDate );
	}
	
	
}
public class MatchSortMain {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   ArrayList<Match> lst = new ArrayList<Match>();
		System.out.println("Please provide the number of matches:");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) {
		    System.out.println("Enter the Match Date:");
		    String s = sc.next();
		    System.out.println("Enter the team 1:");
		    String c = sc.next();
		    System.out.println("Enter the team 2:");
		    String d = sc.next();
		    lst.add(new Match(c,d,s));
		}
		System.out.println("Match details :");
		 Collections.sort(lst);
		 Iterator i = lst.iterator();
	 	while(i.hasNext()) {
	 		System.out.println(i.next()); 
	 	}     
		 sc.close(); 
}
}

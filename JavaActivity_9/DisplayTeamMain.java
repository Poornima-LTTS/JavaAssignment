package com.ltts;
import java.util.*;

public class DisplayTeamMain {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  Set <String>Teamlst = new TreeSet<>();
	  ArrayList<String> Playerlst= new ArrayList<>();
	  System.out.println("Enter the number of input elements:");
	  int n=sc.nextInt();
	  System.out.println("Enter the input in TeamName|PlayerName Format:");
	  for(int i=1;i<=n;i++) {
	  String w = sc.next();
	  String [] words = w.split("\\|");
	  Teamlst.add(words[0]);
	  Playerlst.add(words[1]);}
	  Collections.sort(Playerlst);
	  System.out.println(Teamlst);
	  Iterator i1 = Playerlst.iterator();
	 	while(i1.hasNext()) {
	 		System.out.println(i1.next());
	 		}     
		 sc.close();
}
}

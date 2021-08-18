package com.ltts;
import java.util.*;
class Player implements Comparator<Player>{
    String name;
    String skill;
	public Player(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public int compare(Player o1, Player o2) {
		 return o1.getSkill().compareTo(o2.getSkill());
	}
	
}
public class Main {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <Player> detailslst = new ArrayList<Player>();
		System.out.println("Please provide the number of players to be registered:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
		System.out.println("Please enter player name:");
		String s = sc.next();
		System.out.println("Please select the skill of the player:");
		System.out.println("1.All Rounder");
		System.out.println("2.Batsman");
	    System.out.println("3.Bowler");
	    int c = sc.nextInt();
	    switch(c) {
	    	case 1:
	    		String a = "All Rounder";
	    		detailslst.add(new Player(s,a));
	    		Collections.sort(detailslst,new Player(s, a));
	    		break;
	    	case 2:
	    		String a1 = "Batsman";
	    		detailslst.add(new Player(s,a1));
	    		Collections.sort(detailslst,new Player(s, a1));
	    		break;
	    	case 3:
	    		String a2 = "Bowler";
	    		detailslst.add(new Player(s,a2));
	    		Collections.sort(detailslst,new Player(s, a2));
	            break;
	       
             }}
		for(Player a: detailslst) {  
	         System.out.println("Player: "+a.getName() +"Skill  :"+ a.getSkill() );
	   } 
}		
}
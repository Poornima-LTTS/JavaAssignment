package com.ltts;
import java.util.*;
class Player{
	String bowlername;
	int wicketcount;
	public Player(String bowlername, int wicketcount) {
		this.bowlername = bowlername;
		this.wicketcount = wicketcount;
	}
	public String getBowlername() {
		return bowlername;
	}
	public void setBowlername(String bowlername) {
		this.bowlername = bowlername;
	}
	public int getWicketcount() {
		return wicketcount;
	}
	public void setWicketcount(int wicketcount) {
		this.wicketcount = wicketcount;
	}
	
}
public class HashMapPlayerMain {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 HashMap<String,ArrayList> map=new HashMap<String,ArrayList>();
	 ArrayList <String> detailslst = new ArrayList<String>();
	 List<Integer> countlst = new ArrayList<Integer>();
	 int count=0,j=0,z=3;
	 while(count==0) {
	     System.out.println("Enter the player name to search:");
	     String Name=sc.next();
	     if(map.containsKey(Name)) {
			            List<Integer> head = countlst.subList(j,z);
			            System.out.println("PlayerName:  "+Name);
			            System.out.println("Wickets: "+head.toString().replace("[","").replace("]","").replace(",","").replace(" ", ""));
			            System.out.println("Do you want to add another player (yes/no)");
		 	            String anotherplayer1 = sc.next();
		 	            if(anotherplayer1.equals("no")) {
		 		           count++;
		 	              }
	    		        }
	     else {
	    	 System.out.println("Enter wickets seperated by |:");
	    	 String Wicket=sc.next();
	            String[] words = Wicket.split("\\|");
	            for(String w:words){  
		            detailslst.add(w);
		            }
	            countlst.add(words.length);
	             map.put(Name, detailslst);
	            System.out.println("Do you want to add another player (yes/no)");
	            String anotherplayer1 = sc.next();
	            if(anotherplayer1.equals("no")) {
		           count++;
		            j=j+words.length;
		            z=z+words.length;
	              }
	              }
}
}
}
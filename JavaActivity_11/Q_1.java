package com.ltts;
import java.util.*;
class bowler{
	private String name;
    public bowler(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class wicket extends bowler{
	String playername;
	public wicket(String name,bowler b) {
		super(name);
	}
	
}
public class Q_1 {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 HashMap<String,ArrayList> map=new HashMap<String,ArrayList>();
    	 ArrayList <String> detailslst = new ArrayList<String>();
    	 int count=0,j=0,z=3;
    	 while(count==0) {
    	     System.out.println("Enter the player name to search:");
    	     String Name=sc.next();
    	     if(map.containsKey(Name)) {
				            List<String> head = detailslst.subList(j, z);
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
 		            detailslst.add(w);}
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
     
     
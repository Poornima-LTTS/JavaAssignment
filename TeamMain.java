package com.ltts;
import java.util.*;
class Team{
	String name;
	long numberOfMatches;
	public Team(String name, long numberOfMatches) {
		super();
		this.name = name;
		this.numberOfMatches = numberOfMatches;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(long numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	
}
class TeamComparator implements Comparator<Team>{

	@Override
	public int compare(Team o1, Team o2) {
		if(o1.getNumberOfMatches()==o2.getNumberOfMatches()){
		       return 0; 
		     } 
		     else if(o1.getNumberOfMatches()>o2.getNumberOfMatches()){
		     return 1;
		     }
		     else{
		       return -1;
		     }
	}

}
public class TeamMain {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	List <Team> detailslst = new ArrayList<Team>();
		System.out.println("Enter number of teams:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter details of team"+i+" :");
			System.out.println("Enter name of team:");
			String s = sc.next();
			System.out.println("Enter number of matches:");
			long x = sc.nextLong();
			detailslst.add(new Team(s,x));
		}
		Collections.sort(detailslst,new TeamComparator());
		for(Team a: detailslst) {  
	         System.out.println(a.getName() +"--"+ a.getNumberOfMatches() );
	   } 
	}
}

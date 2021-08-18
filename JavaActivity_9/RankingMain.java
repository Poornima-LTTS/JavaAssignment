package com.ltts;
import java.util.*;
class Ranking implements Comparable<Ranking>{
	private String name;
	private int Score;
	public Ranking(String name,int score) {
		this.name=name;
		this.Score = score;
	}
	private int getScore() {
		return Score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
        return Score+" "+name;
    }
	@Override
    public int compareTo(Ranking o) {

     if(this.Score==o.Score){
       return 0; 
     } 
     else if(this.Score < o.Score){
     return 1;
     }
     else{
       return -1;
     }
}}
public class RankingMain {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Ranking> lst = new ArrayList<Ranking>();
	System.out.println("Please provide the number of players");
	int a = sc.nextInt();
	for(int i=1;i<=a;i++) {
	    System.out.println("Enter the name of the player "+i+":");
	    String s = sc.next();
	    System.out.println("Enter the score of the player "+i+":");
	    int c = sc.nextInt();
	    lst.add(new Ranking(s,c));
	}
	System.out.println("player details :");
	 Collections.sort(lst);
	 Iterator i = lst.iterator();
 	while(i.hasNext()) {
 		System.out.println(i.next()); 
 	}     
	 sc.close(); 
}
}

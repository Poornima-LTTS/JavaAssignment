package com.ltts;
import java.util.*;
public class Q_1 {
  public static void main(String[] args) {
	  int count=0;
	Scanner sc = new Scanner(System.in);
	HashSet h = new HashSet();
	System.out.println("Enter the number of matches:");
	int n=sc.nextInt();
	System.out.println("Enter the player names:");
	for(int i=0;i<n;i++) {
		h.add(sc.next());
	}
	System.out.println(h);
	 Iterator<String> lItr = h.iterator();
 	 while (lItr.hasNext())
 	 {   count++;   
 		 lItr.next();
		}
 	System.out.println("Output:"+count);
}
}

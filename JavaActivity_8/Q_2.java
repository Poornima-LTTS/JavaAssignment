package com.ltts;
import java.util.*;
public class Q_2 {
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
        Set set = new TreeSet();  
        System.out.println("Enter the number of matches:");
    	int n=sc.nextInt();
    	System.out.println("Enter the player names:");
    	for(int i=0;i<n;i++) {
    		set.add(sc.next());
    	}
    	Iterator i = set.iterator();
    	while(i.hasNext()) {
    		System.out.println(i.next()); 
    	}
	}
}

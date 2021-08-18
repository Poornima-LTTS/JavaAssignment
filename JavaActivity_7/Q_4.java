package com.ltts;
import java.util.*;
public class Q_4 {
	public static void main(String[] args) {
		int Countfifty=0,Counthundred=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("number of matches Gayle had played:"); 
		int a = sc.nextInt();
		List<Integer> intlist = new ArrayList<>(Arrays.asList());
		for(int i=0;i<a;i++) {
			 intlist.add(sc.nextInt());
		}
		for (int s : intlist) {
			if(s>=50&&s<100) {
				Countfifty++;
			}
			else if(s>=100){
				Counthundred++;
			}
		}
    	System.out.println("number of 50's Gayle has scored:"+Countfifty);
    	System.out.println("number of 50's Gayle has scored:"+Counthundred);
    	sc.close();
	}
}

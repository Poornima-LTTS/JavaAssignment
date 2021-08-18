package com.ltts;
import java.util.*;
public class Q_3{
	static String name;
    static String team;
	static String skill;
	static int capnumber;
	public static void main(String args[]){  
		Scanner sc = new Scanner (System.in);
		TreeMap<Integer,String> map=new TreeMap<Integer,String>(); 
		System.out.println("Enter the number of players:");
		int n =sc.nextInt(); 
		for(int i=1;i<=n;i++) {
			ArrayList<String> detailslst = new ArrayList<String>();
			System.out.println("Enter the details of player"+i+":");
			capnumber=sc.nextInt();
			name = sc.next();
			team = sc.next();
			skill = sc.next();
			detailslst.add(name);
			detailslst.add("--"+team);
			detailslst.add("--"+skill);
			map.put(capnumber,detailslst.toString().replace("[","").replace("]","").replace(",","").replace(" ", ""));
		}
		System.out.println("Player Details:");
		for(Map.Entry m:map.entrySet()){ 
			System.out.println(m.getKey()+"--"+m.getValue()); 
			    }
		sc.close();
	}
}


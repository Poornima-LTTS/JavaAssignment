package com.ltts;
import java.util.*;
public class Q_2 {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
 		 System.out.println("Enter top 5 teams of IPL13 :");
 		 List<String> ArrayList = new ArrayList<>(Arrays.asList());
 		 for(int i=0;i<5;i++) {
 			 ArrayList.add(sc.nextLine());
 		 }
 		 System.out.println("Enter Swap Positions:");
 		 int a=sc.nextInt();
 		 int b=sc.nextInt();
 		 String c = ArrayList.get(a);
 		 ArrayList.set(a, ArrayList.get(b));
 		 ArrayList.set(b, c);
 		ListIterator<String> lItr = ArrayList.listIterator();
    	while (lItr.hasNext())
		{
			System.out.println(lItr.next());
		}
    	sc.close();
	}
}

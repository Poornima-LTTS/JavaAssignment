package com.ltts;
import java.util.*;
public class Q_3 {
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter top 5 scorers of IPL13 :");
	 List<String> ArrayList = new ArrayList<>(Arrays.asList());
	 for(int i=0;i<5;i++) {
		 ArrayList.add(sc.nextLine());
	 }
	 System.out.println("Enter top 5 scorers of IPL12 :");
	 List<String> stringlist = new ArrayList<>(Arrays.asList());
     for(int j=0;j<5;j++) {
			 stringlist.add(sc.nextLine());
	 }
     System.out.println("Consistent Run scorers:");
     ArrayList.retainAll(stringlist);
     ListIterator<String> lItr = ArrayList.listIterator();
 	 while (lItr.hasNext())
		{
			System.out.println(lItr.next());
		}
     sc.close();
}
}
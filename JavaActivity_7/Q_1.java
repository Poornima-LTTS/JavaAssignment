package com.ltts;
import java.util.*;
public class Q_1 {
	public static void main(String[] args) 
    {   Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player details:");
		System.out.println(	"Enter the player Name:");
		String a = sc.next();
		System.out.println(	"Enter the player age:");
		int b = sc.nextInt();
		System.out.println(	"Enter the Country:");
		String c = sc.next();
		ArrayList <String> arrayList= new ArrayList<String>();
		arrayList.add(a);
		arrayList.add(Integer.toString(b));
        arrayList.add(c);
        System.out.println(	"player details:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(	"Enter the Skill:");
        String d = sc.next();
        System.out.println(	"Enter the position to enter the skill:");
        int e = sc.nextInt();
        arrayList.set(e, d);
        System.out.println(	"player details:");
    	ListIterator <String> lItr = arrayList.listIterator();
    	while (lItr.hasNext())
		{
			System.out.println(lItr.next());
		}
        System.out.println(	"Enter the position of the detail to be removed:");
        int f = sc.nextInt();
        arrayList.remove(f);
        System.out.println(	"player details:");
        ListIterator <String> lItr1 = arrayList.listIterator();
    	while (lItr1.hasNext())
		{
			System.out.println(lItr1.next());
		}
        sc.close();
    }
    
}

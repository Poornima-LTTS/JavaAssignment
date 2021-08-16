package com.ltts;
import java.util.Scanner;
public class HotelMain {
      public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1.DeluxeRoom");
		System.out.println("2.DeluxeACRoom");
		System.out.println("3.SuiteACRoom");
		System.out.println("select type:");
		int i=sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("HotelName:");
			String a = sc.next();
			System.out.println("Room Sq Feet Area:");
			int b = sc.nextInt();
			System.out.println("RoomHasTV:");
			String c = sc.next();
			System.out.println("RoomHasWifi:");
			String d = sc.next();
			DeluxeRoom e = new DeluxeRoom(a,b,c,d);
			int w=e.getRatePerSqFeet();
			System.out.println(e.calculateTariff(w));
			break;
		case 2:
			System.out.println("HotelName:");
			String f = sc.next();
			System.out.println("Room Sq Feet Area:");
			int g = sc.nextInt();
			System.out.println("RoomHasTV:");
			String h = sc.next();
			System.out.println("RoomHasWifi:");
			String j = sc.next();
			DeluxeACRoom k = new DeluxeACRoom(f,g,h,j);
			System.out.println(k.calculateTariff(k.ratePerSqFeet));
			break;
		case 3:
			System.out.println("HotelName:");
			String l = sc.next();
			System.out.println("Room Sq Feet Area:");
			int m = sc.nextInt();
			System.out.println("RoomHasTV:");
			String n = sc.next();
			System.out.println("RoomHasWifi:");
			String o = sc.next();
			SuiteACRoom p = new SuiteACRoom(l,m,n,o);
			int x= p.getRatePerSqFeet();
			System.out.println(p.calculateTariff(x));
			break;
		}
		sc.close();
	}
}

package com.ltts;

public class HotelRoom {
   protected String hotelName;
   protected int numberOfSqFeet;
   protected String hasTV;
   protected String hasWifi;
   public HotelRoom(String hotelName,int numberOfSqFeet,String hasTV,String hasWifi) {
	   this.hotelName=hotelName;
	   this.numberOfSqFeet=numberOfSqFeet;
	   this.hasTV=hasTV;
	   this.hasWifi=hasWifi;
    }
   public int calculateTariff(int a) {
	   int cost=numberOfSqFeet*a;
	  return cost;
	  }
   public int getRatePerSqFeet() {
	   return 0;
   }
}

package com.ltts;

public class DeluxeRoom extends HotelRoom {
    protected int ratePerSqFeet;
	public DeluxeRoom(String hotelName, int numberOfSqFeet, String hasTV, String hasWifi ) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet=10;
	}
	public int getRatePerSqFeet() {
		if(hasWifi.equals("yes")) {
			return (ratePerSqFeet + 2);
		}
		else {
			return ratePerSqFeet;
		}
	}

}

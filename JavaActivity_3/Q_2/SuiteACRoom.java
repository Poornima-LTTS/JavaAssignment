package com.ltts;

public class SuiteACRoom extends HotelRoom {
	private int ratePerSqFeet;
    public SuiteACRoom(String hotelName, int numberOfSqFeet, String hasTV, String hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet=15;
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

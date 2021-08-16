package com.ltts;

public class DeluxeACRoom extends DeluxeRoom {
    int ratePerSqFeet;
	public DeluxeACRoom(String hotelName, int numberOfSqFeet, String hasTV, String hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet=12;
		}
        
}

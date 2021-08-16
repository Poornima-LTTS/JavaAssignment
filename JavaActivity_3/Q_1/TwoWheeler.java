package com.ltts;

public class TwoWheeler extends Vehicle{
    private String KickStartAvailable;
    public String getKickStartAvailable() {
		return KickStartAvailable;
	}

	public void setKickStartAvailable(String kickStartAvailable) {
		KickStartAvailable = kickStartAvailable;
	}

	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String KickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		setKickStartAvailable(KickStartAvailable);
	}
public void displayDetailInfo() {
	System.out.println("---DetailInformation---");
 	   if(getKickStartAvailable().equals("yes")) {
 		   System.out.println("Kick Start Available:YES");
 	   }
 	   else {
 		   System.out.println("Kick Start Available:NO");
 	   }
    }
	
}


	
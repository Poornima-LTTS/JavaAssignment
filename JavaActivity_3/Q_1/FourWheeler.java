package com.ltts;

public class FourWheeler extends Vehicle{
    private String audioSystem;
    private int numberOfDoors;
    
	public String getAudioSystem() {
		return audioSystem;
	}

	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem, int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		setAudioSystem(audioSystem);
		setNumberOfDoors(numberOfDoors);
		
	}
	

	public void displayDetailInfo() {
	   System.out.println("---DetailInformation---");
	   System.out.println("AudioSystem:"+getAudioSystem());
 	   System.out.println("NumberOfDoors:"+getNumberOfDoors());
	}
	
}
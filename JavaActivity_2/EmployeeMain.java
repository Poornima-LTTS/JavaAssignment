package com.ltts;
import java .util.Scanner;
class Employee{
    private String name;
    private String address;
    private String mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
    
    
}

public class EmployeeMain {
      public static void main (String args[]) {
    	  Employee e = new Employee();
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter the Name:");
    	  e.setName(sc.nextLine());
    	  System.out.println("Enter the Address:");
    	  e.setAddress(sc.nextLine());
    	  System.out.println("Enter the Mobile:");
    	  e.setMobile(sc.nextLine());
    	  System.out.println("Employee Details");
    	  System.out.println("Name:"+e.getName());
    	  System.out.println("Address:"+e.getAddress());
    	  System.out.println("Mobile:"+e.getMobile());
    	  sc.close();
      }
}

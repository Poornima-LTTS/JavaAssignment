package com.ltts;

import java.util.Scanner;
class Customer {
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

public class CustomerMain {
	public static void main (String args[]) {
  	  Customer c  = new Customer();
  	  Scanner sc = new Scanner(System.in);
  	  System.out.println("Enter the details:");
  	  String s1 = sc.nextLine();
  	  String[] words=s1.split(",");
  	  c.setName(words[0]);
  	  c.setAddress(words[1]);
  	  c.setMobile(words[2]);
  	  System.out.println("Name:"+c.getName());
  	  System.out.println("Address:"+c.getAddress());
  	  System.out.println("Mobile:"+c.getMobile());
  	  sc.close();
    }
}

package com.ltts;

import java.util.Scanner;
class Employee1{
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

public class EmployeeMain1 {
	public static void main(String[] args) {
		 Employee e1 = new Employee();
         Scanner sc = new Scanner(System.in);
         int count=0;
         System.out.println("Enter the name:");
         e1.setName(sc.nextLine());
   	     System.out.println("Enter the Address:");
   	     e1.setAddress(sc.nextLine());
   	     System.out.println("Enter the Mobile:");
   	     e1.setMobile(sc.nextLine());
   	     System.out.println("Employee Details");
   	     System.out.println("Name:"+e1.getName());
   	     System.out.println("Address:"+e1.getAddress());
   	     System.out.println("Mobile:"+e1.getMobile());
   	     do {
   	        System.out.println("Menu");
   	        System.out.println("1.Update Employee name");
   	        System.out.println("2.Update Employee Address");
   	        System.out.println("3.Update Employee mobile");
   	        System.out.println("4.All information correct/Exit");
   	        int i = sc.nextInt();
   	        switch(i) {
   	             case 1:
   	    	          System.out.println("Current Name is:"+e1.getName());
   	    	          System.out.println("Enter the new name:");
   	    	          e1.setName(sc.next());
   	    	          break;
   	             case 2:
	    	          System.out.println("Current address is:"+e1.getAddress());
	    	          System.out.println("Enter the new Address:");
	    	          e1.setAddress(sc.next());
	    	          break;
   	             case 3:
	    	          System.out.println("Current mobile number is:"+e1.getMobile());
	    	          System.out.println("Enter the new Mobile Number:");
	    	          e1.setMobile(sc.next());
	    	          break;
   	             case 4:
   	    	          System.out.println("The details are:");
   	    	          System.out.println("Name:"+e1.getName());
      	              System.out.println("Address:"+e1.getAddress());
      	              System.out.println("Mobile:"+e1.getMobile());
      	              count++;
      	              break;
      	        
      	    }
   	     }while(count==0);
   	     sc.close();
	}
         
}

package com.ltts;

import java.util.Scanner;
class Company {
    private String name;
    private String employees;
    private String teamlead;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public String getTeamlead() {
		return teamlead;
	}
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
    
    
}
public class CompanyMain {
         public static void main(String[] args) {
        	 int i=0,count=0;
        	 Company c1 = new Company();
        	 Scanner sc = new Scanner(System.in);
        	 System.out.println("Enter the company name:");
        	 c1.setName(sc.nextLine());
        	 System.out.println("Enter the Employees:");
        	 c1.setEmployees(sc.nextLine());
        	 System.out.println("Enter the Team Lead:");
        	 c1.setTeamlead(sc.nextLine());
        	 String s1 = c1.getEmployees();
         	 String[] words=s1.split(",");
         	 while(i<5) {
         	    if(words[i].equals(c1.getTeamlead())) {
         		   System.out.println("Name:"+c1.getName());
     			   System.out.println("Employees:"+c1.getEmployees());
         		   System.out.println("Lead:"+c1.getTeamlead());
         			} 
         	    else {
         	    	count++;
         	    }
              i++;}
         	 if(count==5) {
         		 System.out.println("Invalid input");
         	 }
           sc.close();
		}
         
}

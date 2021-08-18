package com.ltts;
import java.util.Scanner;
class CustomException extends Exception{
	public CustomException(String s)
    {  super(s);
    }
}
public class Q_3 {
	 public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Player name:");
		 String a = sc.next();
		 System.out.println("Enter the Player age:");
		 int i = sc.nextInt();
		 sc.close();
	        try
	        {
	            if(i<19) {
	               throw new CustomException("CustomException:InvalidAgeRangeException");
	            }
	            else {
	            	System.out.println("Player name:"+a);
	            	System.out.println("Player age:"+i);
	            }
	        }
	        catch (CustomException ex)
	        {
	            System.out.println(ex.getMessage());
	        }
}
}
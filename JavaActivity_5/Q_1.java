package com.ltts;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Q_1 {
   public static void main(String[] args) throws ArithmeticException,NumberFormatException{
	try {
	 int runrate;
	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter the total runs scored:");
	 int a = Integer.parseInt(reader.readLine());
	 System.out.println("Enter the total overs faced:");
	 int b=  Integer.parseInt(reader.readLine());
	 runrate =  a/b;
	 System.out.println("Current runrate is:"+runrate);
	}
	catch (Exception e) {
		System.out.println(e);}
}
}

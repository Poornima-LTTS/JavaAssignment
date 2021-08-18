package com.ltts;
import java.util.Scanner;
public class Q_2 {
public static void main(String[] args) throws ArrayIndexOutOfBoundsException,NegativeArraySizeException{
	Scanner sc = new Scanner(System.in);
    try {
        int overs;
    	int overnumber;
    	System.out.println("Enter the number of overs:");
    	overs = sc.nextInt();
    	int []a=new int[overs];
    	System.out.println("Enter the number of runs for each over:");
    	for(int i=0;i<overs;i++) {
    	   a[i] = (int) sc.nextInt();
    	}
    	System.out.println("Enter the over number:");
    	overnumber=sc.nextInt();
    	System.out.println("Runs scored in this over:"+a[overnumber-1]);
    }
    catch (Exception ex) {
        System.out.println(ex);
    }
    sc.close();
}
}

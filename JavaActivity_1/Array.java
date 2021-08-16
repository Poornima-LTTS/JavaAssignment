package com.ltts;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
    	int a[]=new int[5];
    	int sum=0;
    	System.out.println("Enter Array values:");
    	Scanner sc = new Scanner(System.in);
    	for(int i=0;i<a.length;i++) {
        	a[i] = sc.nextInt(); } 
    	for(int i=0;i<a.length;i++) {
    	    sum+=a[i]; }
    	System.out.println("sum of array elements is:"+sum);
    	sc.close();
}
}
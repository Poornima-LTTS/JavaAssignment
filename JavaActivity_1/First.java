package com.ltts;
import java .util.Scanner;
public class First {
	  static int sum=0;  
      public static void main(String[] args) {
    	  
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter the vlue of a and b:");
    	  int a = sc.nextInt();
    	  int b = sc.nextInt();
    	  //Arithmetic Operations
    	  System.out.println("sum of a and b is:"+(a+b));//sum of a and b
  		  System.out.println("subtraction of a and b is:"+(a-b));//subtraction of a and b
  		  System.out.println("Multiplication of a and b is:"+(a*b));//Multiplication of a and b
		  System.out.println("division of a and b is:"+(a/b));//division of a and b
		  System.out.println("Modulo Division of a and b is:"+(a%b));//Modulo Division of a and b
		  System.out.println("PostIncrement of a is:"+(a++));//PostIncrement of a
		  System.out.println("PreIncrement of a is:"+(++a));//PreIncrement of a
		  System.out.println("PostDecrement of b is:"+(b--));//PostDecrement of b
		  System.out.println("PreDecrement of b:"+(--b));//PreDecrement of b
		  //If..Else Conditions
		  if(a>=b) {
			  System.out.println("a is greater than or equal to b");
		  }
		  else if(a<=b) {
			  System.out.println("a is less than or equal to b");
		  }
		  else if(b>=a) {
			  System.out.println("b is greater than or equal to a");
		  }
		  else {
			  System.out.println("b is less than or equal to a");
		  }
		  //Nested if
		  if(a!=0) {
			  if(b!=0) {
				  System.out.println("Nested loop executes");
			  }
		  }
		  //While loop
		  while(a!=b) {
			  System.out.println("While loop executes.");
			  b=a;
		  }
		  //Do..While Loop
		  do {
			  System.out.println("do loop executes.");
		  }while(a!=b);
		  //For loop
		  for (int i = 0; i < 5; i++) {
			sum=sum+a+b;
		}
		  System.out.println("sum is:"+sum);
		  sc.close();
	}
}

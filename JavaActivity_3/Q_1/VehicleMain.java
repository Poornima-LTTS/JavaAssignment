package com.ltts;
import java.util.Scanner;
public class VehicleMain {
       public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
		  System.out.println("1.Four Wheeler");
		  System.out.println("2.Two Wheeler");
		  System.out.println("Enter Vehicle Type:");
		  int i = sc.nextInt();
		  switch(i){
		     case 1:
		    	 String f;
			     System.out.println("Vehicle Make:");
			     String m=sc.next();
		    	 System.out.println("Vehicle Number:");
		    	 String n=sc.next();
		    	 System.out.println("FuelType:");
		    	 System.out.println("1.Petrol");
				 System.out.println("2.Diesel");
                 int t=sc.nextInt();
                 if(t==1) {
                	 f="Petrol";
                 }
                 else{
                	 f="Diesel";
                 }
                 System.out.println("FuelCapacity:");
                 int t1=sc.nextInt();
                 System.out.println("Engine cc:");
                 int c=sc.nextInt();
                 System.out.println("Audio System:");
                 String a=sc.next();
                 System.out.println("Number of doors:");
                 int d=sc.nextInt();
		    	 FourWheeler f1= new FourWheeler(m,n,f,t1,c,a,d);
		    	 f1.displayMake();
		    	 f1.displayBasicInfo();
		    	 f1.displayDetailInfo();
		    	 break;
		     case 2:
		    	 String a1;
			     System.out.println("Vehicle Make:");
			     String m1=sc.next();
		    	 System.out.println("Vehicle Number:");
		    	 String n1=sc.next();
		    	 System.out.println("FuelType:");
		    	 System.out.println("1.Petrol");
				 System.out.println("2.Diesel");
                 int t2=sc.nextInt();
                 if(t2==1) {
                	 a1="Petrol";
                 }
                 else{
                	 a1="Diesel";
                 }
                 System.out.println("FuelCapacity:");
                 int t3=sc.nextInt();
                 System.out.println("Engine cc:");
                 int c1=sc.nextInt();
                 System.out.println("KickStartAvailable:");
                 String k = sc.next();
		    	 TwoWheeler T= new TwoWheeler(m1,n1,a1,t3,c1,k);
		    	 T.displayMake();
		    	 T.displayBasicInfo();
		    	 T.displayDetailInfo();
		    	 break;
		  }
		  sc.close();
	}
}

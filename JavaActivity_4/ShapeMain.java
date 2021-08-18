package com.ltts;
import java.util.Scanner;
abstract class Shape{
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	abstract float calculateArea(int value);
}
class Circle extends Shape{
	private static final float pi = (float) 3.147;

	public float calculateArea(int r) {
		int radius=r;
		float area = (pi*radius*radius);
		return area;
		}
}
class Square extends Shape{
	public float calculateArea(int side) {
		int s=side;
		float area = (s*s);
		return area;
		}
}
public class ShapeMain {
       public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	System.out.println("Sample Input:");
		System.out.println("1.Circle:");
		System.out.println("2.Square:");
		System.out.println("Enter the Shape:");
		String i= sc.next();
		switch(i) {
		case "Circle":
			System.out.println("Enter the radius:");
			int Radius=sc.nextInt();
			Circle c=new Circle();
			System.out.println("Area of circle is:"+c.calculateArea(Radius));
			break;
		case "Square":
			System.out.println("Enter the side:");
			int Side=sc.nextInt();
			Square s1=new Square();
			System.out.println("Area of Square is:"+s1.calculateArea(Side));
			break;
		}
		sc.close();
	}
       
}

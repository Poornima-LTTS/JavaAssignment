package com.ltts;
import java.util.Scanner;
abstract class Match{
	private int currentscore;
	private int currentover;
	private int target;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(int currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	abstract public float calculateRunRate();
	abstract public int calculateBalls();
	abstract public void display(double reqRunrate, int balls);
}
class ODIMatch extends Match{
	public float calculateRunRate() {
		float runrate= ((getTarget())-(getCurrentscore()))/(50-getCurrentover());
		return runrate;
		}
	public int calculateBalls() {
		int remballs=(int) ((50-(getCurrentover()))*6);
		return remballs;
	}
	public void display(double reqRunrate, int balls) {
		int reqruns=(getTarget())-(getCurrentscore());
		System.out.println("Requirments:");
		System.out.println("Need "+reqruns+" runs in "+balls+" balls");
		System.out.println("Required Runrate:" +reqRunrate);
	}
	
}
class TestMatch extends Match{
	public float calculateRunRate() {
		float runrate= ((getTarget())-(getCurrentscore()))/(90-getCurrentover());
		return runrate;		
	}
	public int calculateBalls() {
		int remballs=(int) ((90-(getCurrentover()))*6);
		return remballs;
		}
	public void display(double reqRunrate, int balls) {
		System.out.println("Requirments:");
		int reqruns=(getTarget())-(getCurrentscore());
		System.out.println("Need "+reqruns+" runs in "+balls+" balls");
		System.out.println("Required Runrate:" +reqRunrate);
	}
	
}
class T20Match extends Match{
	public float calculateRunRate() {
		float runrate= ((getTarget())-(getCurrentscore()))/(20-getCurrentover());
		return runrate;		
	}
	public int calculateBalls() {
		int remballs=(int) ((20-(getCurrentover()))*6);
		return remballs;
		}
	public void display(double reqRunrate, int balls) {
		int reqruns=(getTarget())-(getCurrentscore());
		System.out.println("Requirments:");
		System.out.println("Need "+reqruns+" runs in "+balls+" balls");
		System.out.println("Required Runrate:" +reqRunrate);
	}
}
public class MatchMain {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Match Format:");
		System.out.println("1.ODI");
		System.out.println("2.T20");
		System.out.println("3.Test");
		int i = sc.nextInt();
		switch(i) {
		case 1:
			ODIMatch o =new ODIMatch();
			System.out.println("Enter the Current score:");
			o.setCurrentscore(sc.nextInt());
			System.out.println("Enter the current over:");
			o.setCurrentover(sc.nextInt());
			System.out.println("Enter the target score:");
			o.setTarget(sc.nextInt());
			double a=o.calculateRunRate();
			int b = o.calculateBalls();
			o.display(a, b);
			break;
		case 2:
			T20Match t =new T20Match();
			System.out.println("Enter the Current score:");
			t.setCurrentscore(sc.nextInt());
			System.out.println("Enter the current over:");
			t.setCurrentover(sc.nextInt());
			System.out.println("Enter the target score:");
			t.setTarget(sc.nextInt());
			double c = t.calculateRunRate();
			int d= t.calculateBalls();
			t.display(c,d);
			break;
		case 3:
			TestMatch w = new TestMatch();
			System.out.println("Enter the Current score:");
			w.setCurrentscore(sc.nextInt());
			System.out.println("Enter the current over:");
			w.setCurrentover(sc.nextInt());
			System.out.println("Enter the target score:");
			w.setTarget(sc.nextInt());
			double e= w.calculateRunRate();
			int f=w.calculateBalls();
			w.display(e, f);
			break;
		}
		sc.close();
	}
}

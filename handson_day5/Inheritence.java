package com.handson_day5;

import java.util.Scanner;

class Shape{
	protected String shapeName;
	Shape(){
		String shapeName;
	}
		double calculateArea(){
			return 0;
	}
}
class Square extends Shape{
	private int side;
	public int getSide() {
		return side;
	}
	public void setSide(int newSide){
		this.side=newSide;
	}
	double calculateArea(int side) {
		
		System.out.println(side*side);
		return side*side;
	}
}
class Rectangle extends Shape{
	private int length;
	private int breadth;
	public int getLength() {
		return length;
	}
	public void setLength(int newLength) {
		this.length=newLength;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int newBreadth) {
		this.breadth=newBreadth;
	}
	double calculateArea(int length,int breadth) {
		System.out.println(length*breadth);
		return length*breadth;
	}
}
class Circle extends Shape{
	private int radius;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int newRadius) {
		this.radius=newRadius;
	}
	double calculateArea(int radius) {
		float pi=3.14f;
		System.out.println(radius*radius*pi);
		return radius*radius*pi;
	
}
}
public class Inheritence {

	public static void main(String[] args) {
		Shape sh=new Shape();
		System.out.println("1. Rectangle\n2. Square\n3. Circle\n Area Calculator--Choose your Shape");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		if(s==1){
			System.out.println("Enter Length and Breadth Of Rectangle");
			Scanner sc1=new Scanner(System.in);
			int l=sc1.nextInt();
			Scanner sc2=new Scanner(System.in);
			int b=sc2.nextInt();
			Rectangle r=new Rectangle();
			r.calculateArea(l,b);
		}
		else if(s==2) {
			Square sq=new Square();
			System.out.println("Enter Side of Square");
			Scanner sc3=new Scanner(System.in);
			int si=sc3.nextInt();
			sq.calculateArea(si);
			
		}
		else if(s==3) {
			Circle c=new Circle();
			System.out.println("Enter radius of Circle");
			Scanner sc4=new Scanner(System.in);
			int r=sc4.nextInt();
			c.calculateArea(r);
	}
	}
}

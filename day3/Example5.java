package com.day3;

class Figures{
	void area() {
		System.out.println("Figure are");
	}
}
class Rectangle extends Figures{
	void area() {
		System.out.println("Rectangle area");
	}
}
class Triangle extends Figures{
	void area() {
		System.out.println("Triangle area");
	}
}
public class Example5 {

	public static void main(String[] args) {
		Figures f=new Rectangle();
		f.area();
		f =new Triangle();
		f.area();
		f=new Figures();
		f.area();
	}

}

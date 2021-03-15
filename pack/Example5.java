package com.pack;

class Box2{
	double width;
	double height;
	double depth;
	
	public Box2() {
		super();
		width=10;
		height=20;
		depth=15;
	}

	public Box2(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	double volume() {
		return width*height*depth;
	}
}
public class Example5 {

	public static void main(String[] args) {
		Box2 b1=new Box2();
		Box2 b2=new Box2();
		double vol;
		vol=b1.volume();
		System.out.println("volume is "+ vol);
		vol=b2.volume();
		System.out.println("volume"+vol);
	}

}

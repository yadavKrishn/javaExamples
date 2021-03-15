package com.day4;

class Box{
	double width;
	double heigth;
	double depth;
	public Box(double width, double heigth, double depth) {
		super();
		this.width = width;
		this.heigth = heigth;
		this.depth = depth;
	}
	@Override
	public String toString() {
		return "Box [width=" + width + ", heigth=" + heigth + ", depth=" + depth + "]";
	}
	
}
public class Example6 {

	public static void main(String[] args) {
		Box b=new Box(10,12,14);
		System.out.println(b);
		
	}

}

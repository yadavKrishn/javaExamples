package com.pack;
class Box3{
	double width;
	double height;
	double depth;
	
	Box3(){
		width=10;
		height=10;
		depth=10;
	}
	Box3(double w, double h, double d){
		width=10;
		height=10;
		depth=10;
	}
	Box3(int len){
		width=depth=height=len;
	}
	Box3(Box3 b){
		width=b.width;
		height=b.height;
		depth=b.depth;
	}
	double volume() {
		return width*depth*height;
	}
}

public class Example8 {

	public static void main(String[] args) {
		Box3 b1=new Box3();
		Box3 b2=new Box3(5,10,15);
		Box3 b3=new Box3(7);
		Box3 b4=new Box3(b2);
		double vol;
		vol=b1.volume();
		System.out.println(vol);
		vol=b2.volume();
		System.out.println(vol);
		vol=b3.volume();
		System.out.println(vol);
		vol=b4.volume();
		System.out.println(vol);

	}

}

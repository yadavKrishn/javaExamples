package com.day3;
class Sphere{
	float volume() {
		return 3.45f;
	}
}
class HemiSphere extends Sphere{
	float volume() {
		//super.volume();
		return 4.35f;
	}
}
public class Example3 {

	public static void main(String[] args) {
		//HemiSphere h=new HemiSphere();
		//System.out.println(h.volume());
		Sphere s=new HemiSphere();
		System.out.println(s.volume());
		//Hemisphere reference is garbage collector
		s=new Sphere();
		System.out.println(s.volume());
	}

}

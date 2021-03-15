package com.pack;

class Outer{
	static int var=100;
	void show() {
		Inner i=new Inner();
		i.display();
		
	}
	class Inner{
		int x=10;
		void display() {
			System.out.println(x);
			System.out.println(var);
		}
	}
	public Inner Inner() {
		
		return null;
	}
}
public class Example12 {

	public static void main(String[] args) {
		
		//Outer.Inner o=new Outer ().new Inner();
		
		Outer.Inner o= new Outer ().Inner();
		
		o.display();
		/*Outer o=new Outer();
		o.show();*/
	}

}

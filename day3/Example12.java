package com.day3;
abstract class A4{
	abstract void callMe();
	void show() {
		System.out.println("Normal method");
	}
}
class B4 extends A4{
	void callMe() {
		System.out.println("Implemention of abstract method");
	}
}
public class Example12 {

	public static void main(String[] args) {
		B4 b=new B4();
		b.callMe();
		b.show();
	}

}

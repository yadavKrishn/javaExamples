package com.day3;
class A1{
	void callMe() {
		System.out.println("Inside A1'S callMe method");
	}
}
class B1 extends A1{
	void callMe() {
		System.out.println("Inside B1's callMee method");
	}
}
class C1 extends A1{
	void callMe() {
		System.out.println("Inside C1's callMe method");
	}
}
public class Example4 {

	public static void main(String[] args) {
		A1 a=new B1();
		a.callMe();
		a=new C1();
		a.callMe();
		a=new A1();
		a.callMe();
		

	}

}

package com.day3;

public class Example19 {

	public static void main(String[] args) {
		Example19 e=new Example19();
		e=null;//do garbage collection
		System.out.println("Calling garbage collector");
		System.gc();
	}
	protected void finalize() {
		System.out.println("finalise method is called");
	}

}

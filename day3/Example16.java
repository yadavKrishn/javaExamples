package com.day3;

class Test5{
	String str="";
	Test5(String str){
		this.str=str;
	}
	@Override
	public String toString() {
		return "Test5 [str=" + str + "]";
	}
	
}
public class Example16 {

	public static void main(String[] args) {
		Test5 t=new Test5("Hello");
		System.out.println(t);

	}

}

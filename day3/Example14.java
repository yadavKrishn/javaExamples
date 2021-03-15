package com.day3;

interface arthmetic{
	void operation(int a,int b);
	int c=14;
}
class Test1 implements arthmetic{
	@Override
	public void operation(int a, int b) {
		System.out.println(a+b);
		System.out.println(arthmetic.c);
	}
}
class Test2 implements arthmetic{
	@Override
	public void operation(int a,int b) {
		System.out.println(a-b);
		
	}
}
public class Example14 {

	public static void main(String[] args) {
	arthmetic a=new Test1();
	a.operation(6, 4);
	a=new Test2();
	a.operation(10, 5);
	System.out.println(arthmetic.c);
	}

}

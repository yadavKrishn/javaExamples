package com.pack;
class A1{
	int i,j;
	void showij() {
		System.out.println(i+" "+j);
	}
}
class B1 extends A1{
	int k;
	public B1(int a,int b,int c) {
		i=a;
		j=b;
		k=c;
	}

	void subk() {
	System.out.println(k);
	}
}
public class Example13 {

	public static void main(String[] args) {
		B1 b=new B1(10,20,30);
		b.showij();
		b.subk();
	}

}

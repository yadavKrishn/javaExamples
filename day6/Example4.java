package com.day6;

import java.util.Enumeration;
import java.util.Vector;

public class Example4 {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>(3,2);
		System.out.println(v.size());//0
		System.out.println((v.capacity()));//3
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		System.out.println(v.size());//3
		System.out.println(v.capacity());//3
		
		v.addElement(4);//3+2=5
		v.addElement(5);
		v.addElement(6);//5+2
		System.out.println(v.size());//6
		
		v.addElement(7);
		v.addElement(8);
		System.out.println(v.size());//8
		System.out.println(v.capacity());//9
		System.out.println(v);
		System.out.println(v.contains(3));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.elementAt(4));
		v.setElementAt(20, 0);
		System.out.println(v);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}

package com.day6;

import java.util.List;
import java.util.ArrayList;
public class Example1 {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		System.out.println(l1.size());//0
		l1.add("A");
		l1.add("B");
		l1.add(11);//Autoboxing l1.add(new Integer(11));
		l1.add(3.14);
		l1.add(11);
		System.out.println(l1.size());//5
		System.out.println(l1);//[]
		
		ArrayList l3=new ArrayList();
		List l2=new ArrayList();
		l2.addAll(l1);
		System.out.println(l2.size());
		System.out.println(l2);
		List l4=new ArrayList();
		l4.add(4);
		l4.add(5);
		System.out.println(l4.size());
		System.out.println(l4);
		
		List l5=new ArrayList();
		l5.add("A");
		l5.add("B");
		l5.add(1);
		l5.add(3);
		
		 	List l6 =new ArrayList();
	        l6.add("ab");
	        l6.add("cd");
	        l6.add(1);
	        
	        l5.retainAll(l6);
	        System.out.println(l5);
	        System.out.println(l6);
		
	}

}

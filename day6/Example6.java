package com.day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Example6 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(5);
		l.add(15);
		l.add(10);
		l.add(20);
		System.out.println(1);
		//1. for loop
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		//2.For Each statement
		for(int a:l)
			System.out.println(a);
		System.out.println("Using Iterator interface");
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext()) {
			//Integer i=(Integer)itr.next();
			
			//System.out.println(i);
			System.out.println(itr.next());
			
			System.out.println("Using ListIterator interface");
			ListIterator<Integer> Itr=l.listIterator();
			while(Itr.hasNext()) {
				Integer i=Itr.next();
				Itr.set(i+2);
			}
			ListIterator<Integer> Itr1=l.listIterator();
			while(Itr.hasPrevious()) {
				System.out.println(Itr.previous());
			}
		}
	}

}

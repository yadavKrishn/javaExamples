package com.day6;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		System.out.println(l1.size());
		l1.add("z");
		l1.add("b");
		l1.add("d");
		l1.add(1,"a");
		l1.add("c");
		l1.add(3,"g");
		l1.add("f");
		System.out.println(l1.size());//7
		System.out.println(l1);
		
		System.out.println(l1.get(2));
		System.out.println(l1.get(5));
		System.out.println(l1.contains("f"));
		l1.remove(2);//remove elt i 2nd index
		l1.remove("f");
		System.out.println(l1);

	}

}

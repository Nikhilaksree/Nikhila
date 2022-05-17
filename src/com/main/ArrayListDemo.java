package com.main;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList courses = new ArrayList();
		courses.add("java");
		courses.add("c++");
		courses.add("html");
		courses.add("javascript");
		courses.add("sql");
		courses.add("html");
		
		System.out.println(courses);
		
		//traversing
		
		//using Iterator
		Iterator i = courses.iterator();
		while(i.hasNext());
		Object obj = i.next();
		String st = (String) obj;
		System.out.println(st);
		
	}

}

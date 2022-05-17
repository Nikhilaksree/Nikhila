package com.main;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList courses = new ArrayList();
		
		//LinkedList courses = LinkedList();
		
		courses.add("java");
	    courses.add("c++");
	    courses.add("html");
	    courses.add("javascript");
	    courses.add(2, "sql");
	    courses.add("html");
	    
	    System.out.println(courses); //courses.tostring()
	    
	    int size = courses.size();
	    
	    System.out.println("Size: "+size);
		

	}

}

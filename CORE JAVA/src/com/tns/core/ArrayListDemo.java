package com.tns.core;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("A");  //Heterogenous
		
		l.add(1000);  //Support of in built methods
		
		l.add(4.5);
		
		l.add(null);
		
		l.remove(2);
		
		l.add(2, "M");
		
		l.add(45);
		
		System.out.println(l);
		
	}

}

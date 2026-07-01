package com.codegnan.CollectionFramework;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<>(new MyComparator());
		/*t.add(10);
		t.add(0);
		t.add(15);
		t.add(10);*/
		t.add("Roja");
		t.add("ShobaRani");
		t.add("Rajkumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		System.out.println(t); 
	}

}

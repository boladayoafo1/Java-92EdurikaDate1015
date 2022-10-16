package co.edureka.util;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		
		System.out.println(names.add("Pankaj")); //true
		System.out.println(names.add("Pankaj")); //false
		System.out.println(names.add("Roshan")); //true
		names.add("Sanjay");
		names.add("Arun");
		names.add("Bharath");
		
		System.out.println(names + " | size="+names.size());
	}
}

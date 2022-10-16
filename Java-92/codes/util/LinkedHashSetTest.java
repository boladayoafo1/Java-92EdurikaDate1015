package co.edureka.util;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		
		System.out.println(names.add("Pankaj")); //true
		System.out.println(names.add("Pankaj")); //false
		System.out.println(names.add("Roshan")); //true
		names.add("Sanjay");
		names.add("Arun");
		names.add("Bharath");
		
		System.out.println(names + " | size="+names.size());
	}
}

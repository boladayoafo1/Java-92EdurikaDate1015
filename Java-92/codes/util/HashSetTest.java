package co.edureka.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		
		System.out.println(names.add("Pankaj")); //true
		System.out.println(names.add("Pankaj")); //false
		System.out.println(names.add("Roshan")); //true
		names.add("Sanjay");
		names.add("Arun");
		names.add("Bharath");
		
		System.out.println(names + " | size="+names.size());
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.print(name + "     ");
		}
		System.out.println();
	}

}

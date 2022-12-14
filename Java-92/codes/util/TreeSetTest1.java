package co.edureka.util;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>(new NamesComparator());
		
		names.add("Pankaj"); 
		names.add("Pankaj");
		names.add("Roshan"); 
		names.add("Sanjay");
		names.add("Arun");
		names.add("Bharath");
		
		System.out.println(names + " | size="+names.size());
		
		//Set<String> namesDescending = names.descendingSet();
		//System.out.println(namesDescending);
	}
}

class NamesComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {		
		//return 0;
		//return 1;
		//return -1;
		int n = o1.compareTo(o2);
		
		if(n > 0)
			return -1;
		else if(n < 0)
			return 1;
		else
			return 0;
	}	
}

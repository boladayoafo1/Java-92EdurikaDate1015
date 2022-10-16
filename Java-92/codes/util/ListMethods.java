package co.edureka.util;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println("isEmpty --> " + names.isEmpty());
		System.out.println(names + " | size= "+names.size());
		
		names.add("Sunil");		
		names.add("Sunil");
		names.add("Abolade");
		names.add("Anil");
		names.add("Arijith");
		names.add("Asifa");
		names.add("Sunil");
		System.out.println(names + " | size= "+names.size());
		
		names.add(1, "Arun");
		System.out.println(names + " | size= "+names.size());
		
		names.set(1,"ARUN");
		System.out.println(names + " | size= "+names.size());
		
		System.out.println("is \"Sunil\" in list = " + names.contains("Sunil"));
		System.out.println("index of \"Sunil\" = "+ names.indexOf("Sunil"));
		System.out.println("last index of \"Sunil\" = "+ names.lastIndexOf("Sunil"));
		System.out.println("index of \"sunil\" = "+ names.indexOf("sunil")); //-1
		
		System.out.println("person @ index 0 = " + names.get(0));
		//System.out.println("person @ index 10 = " + names.get(10)); //java.lang.IndexOutOfBoundsException
		
		System.out.println(names.remove("Sunil")); //true
		System.out.println(names.remove(0));//ARUN
		
		System.out.println(names + " | size= "+names.size());
	}
}

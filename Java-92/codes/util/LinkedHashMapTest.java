package co.edureka.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new LinkedHashMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 15000f)); //null
		System.out.println(bank.put("Sunil", 11500.5f)); //15000.0
		System.out.println(bank.put("Pankaj", 16500f)); //null
		bank.put("Sanjay", 32750.5f);
		bank.put("Kiran", 25000f);
		bank.put("Abhay", 12500.5f);
		
		System.out.println(bank);
	}
}

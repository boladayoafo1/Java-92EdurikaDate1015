package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BankTest {

	public static void main(String[] args) throws InterruptedException {
		Map<String, Float> bank = new HashMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 15000f)); //null
		System.out.println(bank.put("Sunil", 11500.5f)); //15000.0
		System.out.println(bank.put("Pankaj", 16500f)); //null
		bank.put("Sanjay", 32750.5f);
		bank.put("Kiran", 25000f);
		bank.put("Abhay", 12500.5f);
		
		System.out.println(bank);
		System.out.println();
		
		float bal = bank.get("Sunil");
		System.out.println("A/C Balance of \"Sunil\" = " + bal);
		bal = bal + 1250.5f;
		bank.put("Sunil", bal);
		System.out.println(bank);
		System.out.println();
		
		System.out.print("A/C Holders  ---->  ");
		Set<String> names = bank.keySet();
		for(String name : names) {
			System.out.print(name+"     ");
		}
		System.out.println("\n");
		
		Set<Map.Entry<String, Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String, Float>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Float> entry = it.next();
			String name = entry.getKey();
			bal = entry.getValue();
			System.out.println(name + " ---> " + bal);
			Thread.sleep(2000);
		}
	}

}

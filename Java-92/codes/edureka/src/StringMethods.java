
public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka limited";
		//String str = new String("edureka limited");
		
		System.out.println("size of string = " + str.length());
		System.out.println("char @ index 0 = " + str.charAt(0)); //e
		//System.out.println("char @ index 15 = " + str.charAt(15)); //java.lang.StringIndexOutOfBoundsException
		
		System.out.println("index of \"e\" = " + str.indexOf("e"));
		System.out.println("index of \"e\" from index 3 = " + str.indexOf("e", 3));
		System.out.println("index of \"e\" from last = " + str.lastIndexOf("e"));
		System.out.println("index of \"limited\" = " + str.indexOf("limited"));
		System.out.println("index of \"Limited\" = " + str.indexOf("Limited")); //-1
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.replace('e', '*'));
		System.out.println(str);	
		System.out.println();
		
		String s1 = new String("edureka");
		//String s2 = new String("edureka");
		String s2 = new String("Edureka");
		System.out.println("s1 == s2  ---> " + (s1==s2)); //false
		System.out.println("equals() ---> " + s1.equals(s2));
		System.out.println("contentEquals() ---> " + s1.contentEquals(s2));
		System.out.println("equalsIgnoreCase() ---> " + s1.equalsIgnoreCase(s2));
	}
}

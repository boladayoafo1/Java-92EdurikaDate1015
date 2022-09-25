
public class CharacterType {

	public static void main(String[] args) {
		System.out.println("hexadecimal value of 65 = " + Integer.toHexString(65));
		
		char c = 'A';
		System.out.println(c);
		
		c = 65;
		System.out.println(c);
		
		c = '\u0041';
		System.out.println(c);
		
		int n = 'A';
		System.out.println(n);
		
		c = '\u0905';//hindi
		System.out.println(c);
		
		c = '\u0c05'; //telugu
		System.out.println(c);
		
		c = '\u4eca'; //japanese
		System.out.println(c);
	}
}

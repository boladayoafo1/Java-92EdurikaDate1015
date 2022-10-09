package co.edureka.pack1;

import static java.lang.Math.*;
import static java.lang.System.out;

public class MathTest {

	public static void main(String[] args) {
		out.println(PI);
		out.println(E);
		
		out.println(sin(0));
		out.println(cos(0));
		
		System.out.println(sqrt(25));
		System.out.println(min(10,20));
		System.out.println(max(10, 20));
		
		System.out.println(round(10.657));
		
		System.out.println(floor(10.2)); //10.0
		System.out.println(ceil(10.2)); //11.0
		
		double rand = random();
		System.out.println(rand);
		int otp = (int)(rand * 10000);
		System.out.println("OTP = " + otp);
	}

}

package javaPractice3;

import java.util.function.Consumer;
import java.util.regex.Pattern;

public class Regularexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a = Pattern.matches("[mn]", "n");
		System.out.print(a);
		/*
		 * boolean b = Pattern.matches("[mn]", "mn"); System.out.print(b); boolean c =
		 * Pattern.matches("[mn]", "m"); System.out.print(c); boolean d =
		 * Pattern.matches("[mn]", "mm"); System.out.print(d);
		 */
		//boolean e = Pattern.matches("cat|dog||rat", "dog");
		//System.out.print(e);
		boolean d = Pattern.matches("world$", "world");
		System.out.print(d);




	}

}

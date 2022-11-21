package strings;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String x = " aR c ";
		String y = "   C ar";
		x = x.toLowerCase().trim();// arc
		y = y.toLowerCase().trim();// car
		if (x.length() == y.length()) {
			char[] a = x.toCharArray();
			Arrays.sort(a); // acr
			char[] b = y.toCharArray();
			Arrays.sort(b); // acr
			if (Arrays.equals(a, b)) {
				System.out.println("String x and y are Anagram");
			} else
				System.out.println("String x and y are not Anagram but length is same");
		} else
			System.out.println("String x and y are not Anagram because of length is also not same");
	}
}

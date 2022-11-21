package strings;

public class Occurrences_of_a_Character {
	public static void main(String[] args) {

		// logic 1
		String str = "Java is a Programming Language";
		int len1 = str.length();
		String strNew = str.replace("a", "");
		int len2 = strNew.length();
		int count = len1 - len2;
		System.out.println("Occurrences of character a is " + count);

		// logic 2

		String s = "Looking for a software testing job";
		int count1 = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == 'o') {
				count1++;
			}
		}
		System.out.println("Occurrences of character o is " + count1);
	}
}

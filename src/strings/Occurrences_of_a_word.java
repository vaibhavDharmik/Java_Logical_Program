package strings;

public class Occurrences_of_a_word {
	public static void main(String[] args) {
		String str = "Looking for a software testing job for";
		String[] s = str.split(" ");
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("for")) {
				count++;
			}
		}
		System.out.println(count);
	}
}

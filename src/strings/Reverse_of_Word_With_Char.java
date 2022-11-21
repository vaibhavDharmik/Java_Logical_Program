package strings;

public class Reverse_of_Word_With_Char {
	public static void main(String[] args) {

		String str = "vaibhav bhojraj dharmik";
		String[] splitString = str.split(" ");
		String r = "";
		String revString = "";

		for (int i = splitString.length - 1; i >= 0; i--) {
			r = splitString[i];
			String rev = "";
			for (int j = r.length() - 1; j >= 0; j--) {
				rev = rev + r.charAt(j);
			}
			revString = revString + rev + " ";
		}
		System.out.println(revString);
	}
}

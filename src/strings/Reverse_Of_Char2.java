package strings;

public class Reverse_Of_Char2 {
	public static void main(String[] args) {

		String str = "vaibhav bhojraj dharmik";
		String[] splitString = str.split(" ");
		String r = "";
		String revString = "";

		for (int i = 0; i <= splitString.length - 1; i++) {
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

package strings;

public class Reverse_Of_Word {
	public static void main(String[] args) {

		String str = "vaibhav bhojraj dharmik";
		String[] splitString = str.split(" ");
		String r = "";
		String revString = "";

		for (int i = splitString.length - 1; i >= 0; i--) {
			r = splitString[i];
			revString = revString + r + " ";
		}
		System.out.println(revString);
	}
}

package strings;

/**
 * @author vbhud
 *
 */
public class Reverse_Of_Char1 {
	static String str = "vaibhav";
	static StringBuilder st =  new StringBuilder("vaibhav");;
	static String rev1 = "";
	static String rev2 = "";
	public static void main(String[] args) {

		// logic 1-using for Loop & converting string into Char
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			rev1 = rev1 + ch;
		}
		System.out.println(rev1);

		// logic 2-using for Loop & converting string into Char array
		char[] array = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			rev2 = rev2 + array[i];
		}
		System.out.println(rev2);
		
		// logic 3-using string Buffer
		System.out.println(st.reverse());
		
	}
}

package integers;

public class Palindrome_In_Range {
	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 100;
		System.out.println("The palindrome number Are :");
		for (int i = num1; i <= num2; i++) {
			int ui = i;
			int rev = 0;
			while (ui != 0) {
				rev = rev * 10 + ui % 10;
				ui = ui / 10;
			}
			if (rev == i)
				System.out.print(i + " ");
		}
	}
}
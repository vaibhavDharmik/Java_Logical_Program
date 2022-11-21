package integers;

public class Palindrome {
	public static void main(String[] args) {
		int number = 121;
		int num = number;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Enter no in reverse form is : " + rev);
		if (rev == number)
			System.out.println("Given no is Palindrome");
		else
			System.out.println("Given no is not Palindrome");

	}
}

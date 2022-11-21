package integers;

public class reverse {
	public static void main(String[] args) {
		int num = 542364634;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Enter no.in reverse form is : " + rev);
	}
}

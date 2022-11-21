package integers;

public class Sum_Number_Of_Digits {
	public static void main(String[] args) {

		int num = 123456789;
		int sum = 0;

		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("The sum of digit in No.:" + sum);
	}
}

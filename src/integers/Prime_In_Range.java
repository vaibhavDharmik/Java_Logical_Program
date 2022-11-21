package integers;

public class Prime_In_Range {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 100;
		System.out.println("Prime numbers are :");
		for (int k = num1; k <= num2; k++) {
			int count = 0;
			for (int i = 1; i <= k; i++) {
				if (k % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(k + " ");
			}
		}
	}
}

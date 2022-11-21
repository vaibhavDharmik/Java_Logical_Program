package arrays;

public class Missing_Number {
	public static void main(String[] args) {

		int array[] = { 1, 2, 4, 5 };
		int sum1 = 0;
		int sum2 = 0;
		for (int i : array) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);

		for (int i = array[0]; i <= array[array.length - 1]; i++) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		int mV = sum2 - sum1;
		System.out.println("Missing Value is: " + mV);
	}
}

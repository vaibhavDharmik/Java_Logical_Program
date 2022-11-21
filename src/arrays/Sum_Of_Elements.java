package arrays;

public class Sum_Of_Elements {
	public static void main(String[] args) {

		int array[] = { 12, 32, 45, 21, 56 };
		int sum1 = 0;
		for (int i = 0; i <= array.length-1; i++) {
			sum1 = sum1 + array[i];
		}
		int sum2 = 0;
		for (int i : array) {
			sum2 = sum2 + i;
		}
		System.out.println("Sum of Array by for loop: " + sum1);
		System.out.println("Sum of Array by for-each loop: " + sum2);
	}
}

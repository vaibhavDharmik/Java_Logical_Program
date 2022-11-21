package arrays;

public class Maximum_Minimum_Values {
	public static void main(String[] args) {

		int array[] = { 11, 122, 9, 45, 57 };
		int max = array[0];
		int min = array[0];
		for (int i = 0; i <= array.length - 1; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("Maximum value in Array: " + max);
		System.out.println("Minimum value in Array: " + min);
	}
}

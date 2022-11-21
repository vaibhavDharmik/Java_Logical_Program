package arrays;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int array[] = { 12, 32, 45, 21, 56 };
		// increasing order
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j] - (array[j] = array[i]);
				}
			}
		}
		System.out.print("Array in increasing order: ");
		System.out.println(Arrays.toString(array));
		// decreasing order
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					array[i] = array[i] + array[j] - (array[j] = array[i]);
				}
			}
		}
		System.out.print("Array in decreasing order: ");
		System.out.println(Arrays.toString(array));
		// reverse order
		String ar = "";
		for (int i = array.length - 1; i >= 0; i--) {
			ar = ar + " " + array[i];
		}
		System.out.print("Array in reverse order: ");
		System.out.print(Arrays.asList(ar));
	}
}

package arrays;

public class Duplicate_Elements {
	public static void main(String[] args) {
		int array[] = { 11, 122, 9, 122, 57 };
		boolean flag = false;
		int x = 0;
		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				if (array[i] == array[j]) {
					x = array[i];
					flag = true;
				}
			}
		}
		if (flag = true) {
			System.out.println("Duplicate value in a Array is: " + x);
		} else {
			System.out.println("Duplicate value in Array is not found");
		}
	}

}

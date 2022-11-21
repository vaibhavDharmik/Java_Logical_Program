package arrays;

public class Equality_Of_Two_Arrays {
	public static void main(String[] args) {
		int a[] = { 12, 32, 43, 44 };
		int b[] = { 12, 32, 43, 44 };
		int count = 0;
		if (a.length == b.length) {
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] == b[i]) {
				} else {
					count++;
				}
			}
			if (count == 0) {
				System.out.println("Equal");
			} else {
				System.out.println("Not Equal");
			}
		} else {
			System.out.println("Not Equal");
		}
	}
}
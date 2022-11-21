package arrays;

public class Linear_Search {
	public static void main(String[] args) {
		int array[] = { 11, 12, 9, 122, 57 };
		int search = 122;
		int x = 0;
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			if (search == array[i]) {
				x = i;
				flag = true;
			}
		}
		if (flag == true) {
			System.out.println("Input value is present in Array at the index: " + x);
		} else {
			System.out.println("Input value is not present in Array");
		}
	}
}
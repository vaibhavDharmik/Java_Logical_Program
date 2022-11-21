package arrays;

public class Even_Odd_Numbers {
	public static void main(String[] args) {

		int array[] = { 12, 32, 45, 21, 56 };
		System.out.println("Even no. in Array are: ");
		for (int i : array) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Odd no. in Array are: ");
		for (int j : array) {
			if (j % 2 != 0) {
				System.out.println(j);
			}
		}
	}
}

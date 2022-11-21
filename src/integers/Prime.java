package integers;

public class Prime {
	public static void main(String[] args) {
		int num = 17;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2)
			System.out.print(num + " is a Prime No");
		else
			System.out.print(num + " is not a Prime No");
	}
}

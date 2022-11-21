
public class Swapping {
	static int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		// logic 1
		int c = a;
		a = b;
		b = c;
		System.out.println("Your swap value is : " + a + "," + b);

		// logic 2
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Your swap value is : " + a + "," + b);

		// logic 3
		a = a + b - (b = a);
		System.out.println("Your swap value is : " + a + "," + b);

		// logic 4
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("Your swap value is : " + a + "," + b);

		// logic 5
		a = a * b / (b = a);
		System.out.println("Your swap value is : " + a + "," + b);

	}
}


package integers;

public class Count_Of_Even_Number_Of_Digits {
	public static void main(String[] args) {

		int num = 746237226;

		int evenCount = 0;
		int oddCount = 0;
		while (num != 0) {
			int value = 0;
			value = num % 10;
			num = num / 10;

			if (value % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("No. of even count in number: " + evenCount);
		System.out.println("No. of odd count in number: " + oddCount);
	}
}

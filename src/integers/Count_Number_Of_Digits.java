package integers;

public class Count_Number_Of_Digits {
	public static void main(String[] args) {
		int num = 35617414;
		int count = 0;
		while (num != 0) {

			num = num / 10;
			count++;
		}
		System.out.println("No. of count in number: " + count);
	}
}

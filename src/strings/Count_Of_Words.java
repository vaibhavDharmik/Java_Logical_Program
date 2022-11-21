package strings;

public class Count_Of_Words {
public static void main(String[] args) {
	String str = "Looking for a software testing job";
	String[] array = str.split(" ");
	int count = array.length;
	System.out.println(count);
}
}

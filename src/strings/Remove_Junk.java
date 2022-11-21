package strings;

public class Remove_Junk {
	public static void main(String[] args) {
		String s = "Ca+p#g@em i@ni";
		String replaceChar = s.replaceAll("[^a-zA-z0-9]", "");
		String replaceAlpha = s.replaceAll("[a-zA-z0-9]", "");
		System.out.println(replaceChar);
		System.out.println(replaceAlpha);

	}
}

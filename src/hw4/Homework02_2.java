package hw4;

public class Homework02_2 {
	public static void main(String[] args) {
		String s = "Hello World";

		StringBuilder a = new StringBuilder(s);
		a.reverse();

		System.out.println("反轉後的字串: " + a);
	}
}

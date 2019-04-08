package fundamentals.strings;

public class StringConcatenation {

	// 1. numeric + numeric = ADDITION
	// 2. If either operand is a String = CONCATENATION
	// 3. expressions evaluated from left to right

	public static void main(String... strings) {
		System.out.println(1 + 2); // 3
		System.out.println("a" + "b"); // ab
		System.out.println("a" + "b" + 3); // ab3
		System.out.println(1 + 2 + "c"); // 3c

		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four); // 64

		String s = "1";
		s += "2";
		s += 3; // tricky!
		System.out.println(s); // 123
	}
}

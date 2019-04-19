package fundamentals.strings;

public class StringBuilders {

	// 1. use final keyword for internal object state.
	// 2. create classes with only getter methods.

	@SuppressWarnings("unused")
	public static void main(String... strings) {
		StringBuilder sb = new StringBuilder();
		for (char current ='a'; current <= 'z'; current++) {
			sb.append(current);
		}
		System.out.println(sb);
		int ids[], id ;
	}
}

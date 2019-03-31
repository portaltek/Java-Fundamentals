package fundamentals.inheritance;

public class HiddenMethod2 {
	public static void main(String... strings) {
		Amphibian amphibian = new Amphibian();
		Amphibian frogInAmphibian = new Frog();
		Frog frog = new Frog();
		Amphibian.printStatic();
		Frog.printStatic();
		// amphibian.print();
		// frogInAmphibian.print();
		frog.print();
	}
}

class Amphibian {
	private void print() {
		System.out.println("in Amphibian");
	}

	public static void printStatic() {
		System.out.println("printStatic in Amphibian");
	}
}

class Frog extends Amphibian {
	public void print() {
		System.out.println("in Frog");
	}

	public static void printStatic() {
		System.out.println("printStatic in Frog");
	}

	public static void main(String... strings) {
		Amphibian amphibian = new Amphibian();
		Amphibian frogInAmphibian = new Frog();
		Frog frog = new Frog();
		Amphibian.printStatic();
		Frog.printStatic();
		//amphibian.print();
		//frogInAmphibian.print();
		frog.print();
	}
}

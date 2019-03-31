package fundamentals.inheritance;

public class HiddenMethodParent {

	private String instanceVariable = "HiddenMethodParent.instanceVariable";

	public void printInstanceVariable() {
		System.out.println(instanceVariable);
	}

	public void printInstanceMethod() {
		System.out.println("HiddenMethodParent.printInstanceMethod");
	}

	public static void printStaticMethod() {
		System.out.println("HiddenMethodParent.printStaticMethod");
	}
	
	public void publicInstanceMethod() {
		System.out.println("HiddenMethodParent.publicInstanceMethod");
		privateInstanceMethod();
	}
	
	private void privateInstanceMethod() {
		System.out.println("HiddenMethodParent.privateInstanceMethod");
	}

}

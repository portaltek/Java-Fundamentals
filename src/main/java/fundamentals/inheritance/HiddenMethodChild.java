package fundamentals.inheritance;

public class HiddenMethodChild extends HiddenMethodParent {
	String instanceVariable = "HiddenMethodChild.instanceVariable";

	public void printInstanceVariable() {
		System.out.println(instanceVariable);
	}

	public void printInstanceMethod() {
		System.out.println("HiddenMethodChild.printInstanceMethod");
		
	}

	public static void printStaticMethod() {
		System.out.println("HiddenMethodChild.printStaticMethod");
	}
	
	public void publicInstanceMethod() {
		System.out.println("HiddenMethodChild.publicInstanceMethod");
		privateInstanceMethod();
	}
	
	private void privateInstanceMethod() {
		System.out.println("HiddenMethodChild.privateInstanceMethod");
	}
}

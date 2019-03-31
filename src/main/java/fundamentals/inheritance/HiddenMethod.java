package fundamentals.inheritance;

public class HiddenMethod {

	public static void main(String... args) {

		HiddenMethodParent parent = new HiddenMethodParent();
		HiddenMethodParent childInParentReference = new HiddenMethodChild();
		HiddenMethodChild child = new HiddenMethodChild();

		System.out.println("==========================================");

		parent.printInstanceVariable();
		childInParentReference.printInstanceVariable();
		child.printInstanceVariable();

		System.out.println("==========================================");

		parent.printInstanceMethod();
		childInParentReference.printInstanceMethod(); // Calls object method
		child.printInstanceMethod();

		System.out.println("==========================================");
		parent.printStaticMethod();
		childInParentReference.printStaticMethod(); // Calls parent's reference method.
		child.printStaticMethod();

		System.out.println("==========================================");

		HiddenMethodParent.printStaticMethod();
		HiddenMethodChild.printStaticMethod();

		System.out.println("==========================================");

		parent.publicInstanceMethod();
		childInParentReference.publicInstanceMethod();
		child.publicInstanceMethod();
	}

}

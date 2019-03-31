package fundamentals.inheritance;

public class OverrideMethod {
	/*
	 * STATIC METHOD CAN BE OVERLOADED BUT NOT OVERRIDDEN
	 * 
	 */
	public static void main(String... strings) {
		OverrideMethodChild overrideMethodChild = new OverrideMethodChild();
		overrideMethodChild.publicOverrideMethod();
		overrideMethodChild.publicOverrideMethod();
		overrideMethodChild.publicOverrideMethod();
		
		//Overriding!
		OverrideMethodParent overrideMethodParent = new OverrideMethodChild();
		overrideMethodParent.publicOverrideMethod();
		overrideMethodParent.publicOverrideMethod();
		overrideMethodParent.publicOverrideMethod();
		
		
		OverrideMethodParent overrideMethodParent2 = new OverrideMethodParent();
		overrideMethodParent2.publicOverrideMethod();
		overrideMethodParent2.publicOverrideMethod();
		overrideMethodParent2.publicOverrideMethod();
	}
}

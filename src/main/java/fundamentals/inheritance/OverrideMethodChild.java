package fundamentals.inheritance;

public class OverrideMethodChild extends OverrideMethodParent {

	/*
	 * ACCESS MODIFIER
	 */

	// Hides parent method. Not override allowed.
	// Compilation error is thrown if use @Override annotation
	@SuppressWarnings("unused")
	private void privateOverrideMethod() {
		System.out.println("OverrideMethodChild.privateOverrideMethod");
	}

	// Can be protected, default (under same PKG), public
	// in other PKG becomes private and it hides parent method.
	void defaultOverrideMethod() {
		System.out.println("OverrideMethodChild.defaultOverrideMethod");
	}

	// Can be protected, public
	protected void protetedOverrideMethod() {
		System.out.println("OverrideMethodChild.protetedOverrideMethod");
	}

	// Can be public
	public void publicOverrideMethod() {
		System.out.println("OverrideMethodChild.publicOverrideMethod");
	}

	/*
	 * RETURN TYPE
	 */
	// Must be same RETURN TYPE has overridden method
	public int returnInt() {
		return 2;
	}

	// Must be same RETURN TYPE has overridden method
	public Integer returnInteger() {
		return 1;
	}

	// Can return a Child object from overridden method
	// Cannot return parent class such as Object.
	public OverrideMethodChild returnObject() {
		return new OverrideMethodChild();
	}

	/*
	 * PARAMETER TYPE
	 */
	public void parameterInt(int param) {
	}

	public void parameterInteger(Integer param) {
	}

	public void parameterObject(Object param) {
	}
	//MUST BE SAME CLASS! otherwise it becomes overloaded method.
	public void parameterObject(OverrideMethodParent param) {
	}

	public void parameterObject(OverrideMethodChild param) {
	}

}

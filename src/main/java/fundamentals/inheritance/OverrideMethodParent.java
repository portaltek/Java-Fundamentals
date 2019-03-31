package fundamentals.inheritance;

public class OverrideMethodParent {

	/*
	 * ACCESS MODIFIER
	 */

	@SuppressWarnings("unused")
	private void privateOverrideMethod() {
		System.out.println("OverrideMethodParent.privateOverrideMethod");
	}

	protected void protetedOverrideMethod() {
		System.out.println("OverrideMethodParent.protetedOverrideMethod");
	}

	void defaultOverrideMethod() {
		System.out.println("OverrideMethodParent.defaultOverrideMethod");
	}

	public void publicOverrideMethod() {
		System.out.println("OverrideMethodParent.publicOverrideMethod");
	}

	/*
	 * RETURN TYPE
	 */
	public int returnInt() {
		return 2;
	}

	public Integer returnInteger() {
		return new Integer("1");
	}

	public OverrideMethodParent returnObject() {
		return new OverrideMethodParent();
	}

	/*
	 * PARAMETER TYPE
	 */
	public void parameterInt(int param) {
	}

	public void parameterInteger(Integer param) {
	}

	public void parameterObject(OverrideMethodParent param) {
	}

}

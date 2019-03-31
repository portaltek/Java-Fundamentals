package fundamentals.designpatterns.singleton;

/*
 * Enums are serializables and you cannot change constructor with Java Reflection
 */
public enum MySingletonLazyEnum {
	INSTANCE;
	private int value; // You can add more values or objects

	private MySingletonLazyEnum() {
		value = 1;
		System.out.println(this.getClass().getName());
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

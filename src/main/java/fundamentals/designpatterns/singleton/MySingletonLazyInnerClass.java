package fundamentals.designpatterns.singleton;

import java.io.Serializable;

/*
 * Cons: JavaReflection
 */
public class MySingletonLazyInnerClass implements Serializable {

	private static final long serialVersionUID = 1L;

	private int value; // You can add more values or objects

	private MySingletonLazyInnerClass() {
		System.out.println(this.getClass().getName());
	}

	// Inner classes are not loaded until they are referenced.
	private static class Holder {
		private static MySingletonLazyInnerClass instance = new MySingletonLazyInnerClass();
	}

	public static MySingletonLazyInnerClass getInstance() {
		return Holder.instance;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	protected Object readResolve() {
		return getInstance();
	}

}

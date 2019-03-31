package fundamentals.designpatterns.singleton;

import java.io.Serializable;

/*
 * To solve any serialization issue implement method: protected Object readResolve() 
 *  
 */
public class MySingletonSerializable implements Serializable {

	private static final long serialVersionUID = 1L;

	private static MySingletonSerializable INSTANCE = null;

	private MySingletonSerializable() {
		System.out.println(this.getClass().getName());
	}

	public static MySingletonSerializable getInstance() {
		if (INSTANCE == null) {
			synchronized (MySingletonSerializable.class) {
				if (INSTANCE == null) {
					INSTANCE = new MySingletonSerializable();
				}
			}
		}
		return INSTANCE;
	}

	protected Object readResolve() {
		return INSTANCE;
	}
}

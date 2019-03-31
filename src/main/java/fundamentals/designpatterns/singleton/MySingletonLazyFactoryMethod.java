package fundamentals.designpatterns.singleton;

//ALIAS: DOUBLE CHECKED LOCKING
public class MySingletonLazyFactoryMethod {
	private static MySingletonLazyFactoryMethod INSTANCE = null;

	private MySingletonLazyFactoryMethod() {
		System.out.println(this.getClass().getName());
	}

	public static MySingletonLazyFactoryMethod getInstance() {
		if (INSTANCE == null) {
			synchronized (MySingletonLazyFactoryMethod.class) {
				if (INSTANCE == null) {
					INSTANCE = new MySingletonLazyFactoryMethod();
				}
			}
		}
		return INSTANCE;
	}
}

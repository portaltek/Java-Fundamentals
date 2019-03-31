package fundamentals.designpatterns.singleton;

public class MySingletonEagerFactoryMethod {
	private static final MySingletonEagerFactoryMethod INSTANCE = new MySingletonEagerFactoryMethod();

	private MySingletonEagerFactoryMethod() {
		System.out.println(this.getClass().getName());
	}

	public static MySingletonEagerFactoryMethod getInstance() {
		return INSTANCE;
	}
}

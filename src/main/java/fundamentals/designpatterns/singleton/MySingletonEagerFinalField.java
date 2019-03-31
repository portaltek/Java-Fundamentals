package fundamentals.designpatterns.singleton;

public class MySingletonEagerFinalField {
	public static final MySingletonEagerFinalField INSTANCE = new MySingletonEagerFinalField();

	private MySingletonEagerFinalField() {
		System.out.println(this.getClass().getName());
	}
}

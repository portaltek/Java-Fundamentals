package fundamentals.designpatterns.singleton;

import java.lang.reflect.Constructor;

/*
 * INTERVIEW PRO QUESTIONS TO ASK INTERVIEWER:
 * Do you need eager or lazy initialization?
 * Do you need safety against java reflection?
 * Do you need to serialize the singleton object multiple times?
 * 
 */
public class MySingletonDemo {
	public static void main(String... strings) throws InterruptedException {
		MySingletonDemo mySingletonDemo = new MySingletonDemo();
		mySingletonDemo.validateEnumSingletonWithReflection();
	}

	public void validateEnumSingleton() {
		System.out.println("================================");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MySingletonLazyEnum mySingletonEnum = MySingletonLazyEnum.INSTANCE;
		System.out.println(mySingletonEnum);
		System.out.println(mySingletonEnum.getValue());
		mySingletonEnum.setValue(2);
		System.out.println(mySingletonEnum.getValue());
	}

	public void validateEnumSingletonWithReflection() {
		MySingletonLazyEnum instance1 = MySingletonLazyEnum.INSTANCE;
		MySingletonLazyEnum instance2 = null;
		Constructor<?>[] cstr = MySingletonLazyEnum.class.getDeclaredConstructors();
		for (Constructor<?> constructor : cstr) {
			try {
				constructor.setAccessible(true); // Setting constructor accessible
				instance2 = (MySingletonLazyEnum) constructor.newInstance();
				break;
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

	public void validateInnerClassSingletonWithReflection() {
		MySingletonLazyInnerClass instance1 = MySingletonLazyInnerClass.getInstance();
		MySingletonLazyInnerClass instance2 = null;
		Constructor<?>[] cstr = MySingletonLazyInnerClass.class.getDeclaredConstructors();
		for (Constructor<?> constructor : cstr) {
			try {
				constructor.setAccessible(true); // Setting constructor accessible
				instance2 = (MySingletonLazyInnerClass) constructor.newInstance();
				break;
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}

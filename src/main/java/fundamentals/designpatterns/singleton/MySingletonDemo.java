package fundamentals.designpatterns.singleton;

/*
 * INTERVIEW PRO QUESTIONS TO ASK INTERVIEWER:
 * Do you need eager or lazy initialization?
 * Do you need safety against java reflection?
 * Do you need to serialize the singleton object multiple times?
 * 
 */
public class MySingleton {
	public static void main(String... strings) throws InterruptedException {
		System.out.println("================================");
		Thread.sleep(1000);
		MySingletonLazyEnum mySingletonEnum = MySingletonLazyEnum.INSTANCE;
		System.out.println(mySingletonEnum);
		System.out.println(mySingletonEnum.getValue());
		mySingletonEnum.setValue(2);
		System.out.println(mySingletonEnum.getValue());
	}
}

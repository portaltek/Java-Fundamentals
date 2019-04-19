package fundamentals.designpatterns.singleton;

public class _SingletonDemoSerialize {

	public static void main(String[] args) {
		_SingletonDemoSerialize serializeDemo = new _SingletonDemoSerialize();
//		serializeDemo.testSerializeEnum();
//		serializeDemo.testSerializeInnerClass();
		serializeDemo.testSerializeEnumToJSON();

	}
	
	public void testSerializeEnumToJSON() {

		MySingletonLazyEnum instance1 = MySingletonLazyEnum.INSTANCE;
		instance1.setValue(2);

		UtilJSON.write(instance1);
		instance1.setValue(3);
		System.out.println(instance1.getValue());
		MySingletonLazyEnum instance2 = (MySingletonLazyEnum) UtilJSON.read(MySingletonLazyEnum.class);
		String output = instance1 == instance2 ? "Objects are SAME" : "Objects are NOT SAME";
		System.out.println(output);
		System.out.println(instance1.getValue());
		System.out.println(instance2.getValue());
	}	

	public void testSerializeEnum() {

		MySingletonLazyEnum instance1 = MySingletonLazyEnum.INSTANCE;
		instance1.setValue(2);

		UtilSerializer.serialize(instance1);
		instance1.setValue(3);

		MySingletonLazyEnum instance2 = (MySingletonLazyEnum) UtilSerializer.deserialize();
		String output = instance1 == instance2 ? "Objects are SAME" : "Objects are NOT SAME";
		System.out.println(output);
		System.out.println(instance1.getValue());
		System.out.println(instance2.getValue());
	}



	public void testSerializeInnerClass() {

		MySingletonLazyInnerClass instance1 = MySingletonLazyInnerClass.getInstance();
		instance1.setValue(2);

		UtilSerializer.serialize(instance1);
		instance1.setValue(3);

		MySingletonLazyInnerClass instance2 = (MySingletonLazyInnerClass) UtilSerializer.deserialize();
		String output = instance1 == instance2 ? "Objects are SAME" : "Objects are NOT SAME";
		System.out.println(output);
		System.out.println(instance1.getValue());
		System.out.println(instance2.getValue());
	}

}

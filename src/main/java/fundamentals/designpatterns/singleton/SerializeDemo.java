package fundamentals.designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDemo implements Serializable {

	private static final long serialVersionUID = 1L;

	public static void serialize(Object singleton) {
		try {
			FileOutputStream fileOut = new FileOutputStream("out.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(singleton);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Object deserialize() {
		Object object = null;
		try {
			FileInputStream fileIn = new FileInputStream("out.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			object = (Object) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("singletons.SingletonEnum class not found");
			c.printStackTrace();
		}
		return object;
	}

	public static void main(String[] args) {
		MySingletonLazyEnum instance = MySingletonLazyEnum.INSTANCE;
		MySingletonLazyInnerClass mySingletonLazyInnerClass = MySingletonLazyInnerClass.getInstance();
		
		mySingletonLazyInnerClass.setValue(1);
		instance.setValue(2);
		
		
		Object singleton = mySingletonLazyInnerClass;
		serialize(singleton);
		instance.setValue(3);

		Object singleton2 = deserialize();
		String output = singleton == singleton2 ? "Objects are SAME" : "Objects are NOT SAME";
		System.out.println(output);
		System.out.println(((MySingletonLazyInnerClass) singleton).getValue());
		System.out.println(((MySingletonLazyInnerClass) singleton2).getValue());
	}
}

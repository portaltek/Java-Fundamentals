package fundamentals.designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class UtilSerializer {
	private static final String defaultFile = "out.ser";

	private UtilSerializer() {
	}

	public static void serialize(Object object) {
		serialize(object, defaultFile);
	}

	public static Object deserialize() {
		return deserialize(defaultFile);
	}

	public static void serialize(Object singleton, String file) {
		try {
			FileOutputStream fileOut = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(singleton);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Object deserialize(String file) {
		Object object = null;
		try {
			FileInputStream fileIn = new FileInputStream(file);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			object = (Object) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}
		return object;
	}
}

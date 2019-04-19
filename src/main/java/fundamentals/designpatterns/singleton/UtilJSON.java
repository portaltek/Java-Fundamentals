package fundamentals.designpatterns.singleton;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public final class UtilJSON {

	private static final String FILE = "output.json";

	private UtilJSON() {
	}

	public static void write(Object object, String file) {

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.writeValue(new FileOutputStream(file), object);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Object read(Class<?> clazz, String file) {

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.readValue(new File(FILE), clazz);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void write(Object object) {
		write(object, FILE);
	}

	public static Object read(Class<?> clazz) {
		return read(clazz, FILE);
	}
}

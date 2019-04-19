package fundamentals.designpatterns.singleton;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Enums are serializables and you cannot change constructor with Java Reflection
 * you cannot serialize other fields 
 */

@JsonFormat(shape = Shape.OBJECT)
public enum MySingletonLazyEnum {
	INSTANCE;
	private int value; // You can add more values or objects
	private String config;

	private MySingletonLazyEnum() {
		value = 1;
		config = "Config";
		System.out.println(this.getClass().getName());
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	@JsonCreator
	static MySingletonLazyEnum findValue(@JsonProperty("value") int value, @JsonProperty("config") String config) {
		MySingletonLazyEnum.INSTANCE.value = value;
		MySingletonLazyEnum.INSTANCE.config = config;
		return MySingletonLazyEnum.INSTANCE;
	}

}

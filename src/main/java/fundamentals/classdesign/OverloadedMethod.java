package fundamentals.classdesign;

import java.io.IOException;

public class OverloadedMethod {

	public void overloadedMethod(int param1, String param2) throws Exception { // Original method
	}

	public void overloadedMethod(String param2, int param1) throws Exception { // Change order
	}

	public void overloadedMethod(int param1, String param2, int... params3) throws Exception { // Add extra params
	}

	// OTHER CHANGES NEED TO HAVE DIFFERENT PARAMETER ORDER, NUMBER OR TYPES:

	public Object overloadedMethod(int param1, int param2) throws Exception { // Change return type modifier
		return new Object();
	}

	protected void overloadedMethod(int param1, char param2) throws Exception { // Change access modifier
	}

	public void overloadedMethod(int param1, long param2) throws IOException { // Change exception list
	}

}

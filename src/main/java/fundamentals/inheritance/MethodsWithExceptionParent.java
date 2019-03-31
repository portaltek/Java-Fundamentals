package fundamentals.inheritance;

import fundamentals.exceptions.impl.CheckedException;
import fundamentals.exceptions.impl.CheckedExceptionChild;

public class MethodsWithExceptionParent {

	protected void protectedMethod() throws CheckedExceptionChild {
	}

	void defaultMethod() throws CheckedException {
	}

	public void publicMethod() throws Exception {
	}

}

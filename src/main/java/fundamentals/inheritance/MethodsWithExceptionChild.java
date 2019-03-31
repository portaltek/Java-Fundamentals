package fundamentals.inheritance;

import fundamentals.exceptions.impl.CheckedException;
import fundamentals.exceptions.impl.CheckedExceptionChild;

public class MethodsWithExceptionChild extends MethodsWithExceptionParent {

	// Can throw CheckedExceptionChild
	protected void protectedMethod() throws CheckedExceptionChild {
	}

	// Can throw CheckedExceptionChild, CheckedException
	void defaultMethod() throws CheckedException {
	}

	// Can throw CheckedExceptionChild, CheckedException & Exception
	public void publicMethod() throws Exception {
	}

}

package fundamentals.exceptions.impl;

/* CHECKED EXCEPTION:
 * Checked by compiler at compilation-time. Also named COMPILE TIME EXCEPTIONS.
 * Programmer responsability to handle them.
 * 
 * Exception
 * 		RuntimeException
 * 		InterrupedException
 * 		IOException
 * 			FileNotFoundException
 * 			EOFException
 * 
 */

public class CheckedException extends Exception {
	private int internalState = 0;

	private static final long serialVersionUID = 1L;

	public CheckedException(int internalState) {
		this.internalState = internalState;
	}

	public int getInternalState() {
		return internalState;
	}

}

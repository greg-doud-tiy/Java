package testing;

public class Mainline {

	public static void main(String[] args) throws MyException {
		System.err.println("This is a test");
		try {
			// contains a statement that can throw an exception
			int[] ints = new int[2];
			int i = ints[2];
		} catch (Exception ex) {
			// executes when an exception is 'caught'
			System.out.println("An exception was thrown here.");
		} finally {
			// happens regardless of an exception or not
		}

//		throw new MyException("A no reason exception");
	}
}
class MyException extends Exception {
	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);
	}
	public MyException(String message, Throwable cause) {
		super(message, cause);
	}
	public MyException(Throwable cause) {
		super(cause);
	}
}
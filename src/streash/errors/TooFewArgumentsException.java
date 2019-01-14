package streash.errors;

public class TooFewArgumentsException extends IllegalArgumentException {
	private static final long serialVersionUID = 1L;
	String functionName;
	public TooFewArgumentsException(String functionName) {
		super("Too few arguments for "+functionName);
	}
	public TooFewArgumentsException() {
		super("Too few arguments");
	}
}

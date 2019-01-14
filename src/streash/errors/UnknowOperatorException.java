package streash.errors;

public class UnknowOperatorException extends IllegalArgumentException{
	private static final long serialVersionUID = 1L;
	
	public UnknowOperatorException() {
		super("Unknown operator");
	}

}

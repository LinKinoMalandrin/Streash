package streash.vars.functions.sources;

import streash.vars.Number;
import streash.vars.Value;
import streash.vars.functions.AbstractFunction;
import streash.vars.stream.InfiniteIntegersStream;

public class InfiniteIntegers extends AbstractFunction {
	private boolean reversed;

	public InfiniteIntegers(boolean reversed) {
		super(1);
		this.reversed = reversed;
	}

	/**
	 * 
	 * @return a stream containing the number from the value to the infinite or from
	 *         minus infinite to the value
	 */
	@Override
	public Value evaluate() {
		super.evaluate();
		Value[] args = super.getArgs();
		if (args[0] instanceof Number) {
			Number n = (Number) args[0];
			if (!n.isInteger()) {
				throw new IllegalArgumentException("Cannot use integer() with a floating Number");
			}
			return new InfiniteIntegersStream(n.getValue(), reversed);
		}
		super.illegalTypesException();
		return null;
	}

	@Override
	public String getName() {
		return "integers";
	}
}

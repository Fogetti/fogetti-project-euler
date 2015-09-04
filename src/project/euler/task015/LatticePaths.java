package project.euler.task015;

import java.math.BigInteger;

public class LatticePaths {

	public long apply(long x, long y) {
		return factorial(x+y).divide(factorial(x).multiply(factorial(y))).longValue();
	}
	
	private BigInteger factorial(long n) {
		BigInteger result = new BigInteger("1");
		for (long i = 1; i <= n; i++) {
			result = result.multiply(new BigInteger(String.valueOf(i)));
		}
		return result;
	}

}

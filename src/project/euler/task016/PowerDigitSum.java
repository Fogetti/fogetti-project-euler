package project.euler.task016;

import java.math.BigInteger;

public class PowerDigitSum {

	public long apply(int power) {
		BigInteger bigint = new BigInteger("2");
		BigInteger shiftLeft = bigint.shiftLeft(power-1);
		String digits = shiftLeft.toString();
		char[] charArray = digits.toCharArray();
		long result = 0;
		for (char c : charArray) {
			result += Character.getNumericValue(c);
		}
		return result;
	}

}

package project.euler.task013;

import java.math.BigInteger;

public class LargeSum {

	public BigInteger apply(String numbers) {
		String[] nums = numbers.split("\\s");
		BigInteger result = new BigInteger("0");
		for (String num : nums) {
			result = result.add(new BigInteger(num));
		}
		return result;
	}

}

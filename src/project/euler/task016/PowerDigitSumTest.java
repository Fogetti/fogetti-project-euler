package project.euler.task016;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PowerDigitSumTest {

	@Test
	public void givenRule() throws Exception {
		// Given we want to calculate the digit sum of some power of 2
		PowerDigitSum pds = new PowerDigitSum();

		// When the power is 15
		long sum = pds.apply(15);

		// Then 2^15 = 32768 and 3 + 2 + 7 + 6 + 8 = 26
		assertEquals("Shifting and powering was different", 2 << 14, Math.pow(2.0, 15), 0.00000001);
		assertEquals("The returned sum of power digits was wrong", 26, sum);
	}

	@Test
	public void test() throws Exception {
		// Given we want to calculate the digit sum of some power of 2
		PowerDigitSum pds = new PowerDigitSum();

		// When the power is 1000
		long sum = pds.apply(1000);

		// Then 2^1000 = ...
		System.out.println(sum);
	}
}

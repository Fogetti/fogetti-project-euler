package project.euler.task006;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumSquareDifferenceTest {

	@Test
	public void givenResult() throws Exception {
		// Given 1^2 + 2^2 + ... + 10^2 = 385
		// And (1 + 2 + ... + 10)^2 = 55^2 = 3025
		SumSquareDifference sumSquareDiff = new SumSquareDifference();

		// When we calculate their difference
		int result = sumSquareDiff.apply(10);

		// Then 3025 − 385 = 2640
		assertEquals("The result was wrong", 2640, result);
	}

	@Test
	public void test() throws Exception {
		// Given 1^2 + 2^2 + ... + 10^2 = 385
		// And (1 + 2 + ... + 10)^2 = 55^2 = 3025
		SumSquareDifference sumSquareDiff = new SumSquareDifference();

		// When we calculate their difference
		int result = sumSquareDiff.apply(100);

		// Then 3025 − 385 = 2640
		System.out.println(result);
	}
}

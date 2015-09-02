package project.euler.task010;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SummationOfPrimesTest {

	@Test
	public void givenResult() throws Exception {
		// Given we are looking for the sum of primes
		SummationOfPrimes summation = new SummationOfPrimes();

		// When the limit is 10
		long sum = summation.apply(10);

		// Then The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17
		assertEquals("", 17, sum);
	}

	@Test
	public void test() throws Exception {
		// Given we are looking for the sum of primes
		SummationOfPrimes summation = new SummationOfPrimes();

		// When the limit is 2000000
		long sum = summation.apply(2000000);

		// Then
		System.out.println(sum);
	}
}

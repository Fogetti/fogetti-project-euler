package project.euler.task007;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindNthPrimeTest {

	@Test
	public void givenResult() throws Exception {
		// Given we are searching for primes
		FindNthPrime findNthPrime = new FindNthPrime();

		// When list the first 6 primes
		int result = findNthPrime.apply(6);

		// Then the 6th is 13
		assertEquals("The resulted prime was wrong", 13, result);
	}

	@Test
	public void test() throws Exception {
		// Given we are searching for primes
		FindNthPrime findNthPrime = new FindNthPrime();

		// When list the first 10001 primes
		int result = findNthPrime.apply(10001);

		// Then the 10001th is
		System.out.println(result);
	}
}

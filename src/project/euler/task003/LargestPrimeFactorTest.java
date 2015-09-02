package project.euler.task003;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestPrimeFactorTest {

	@Test
	public void givenResult() throws Exception {
		// Given we are looking for the largest prime factor
		LargestPrimeFactor factorizer = new LargestPrimeFactor();

		// When we are providing 13195
		long largest = factorizer.apply(13195L).last();

		// Then the largest factor is 29
		assertEquals("The returned largest prime factor was wrong", 29, largest);
	}
	
	@Test
	public void test() throws Exception {
		// Given we are looking for the largest prime factor
		LargestPrimeFactor factorizer = new LargestPrimeFactor();

		// When we are providing 600851475143
		long largest = factorizer.apply(600851475143L).last();

		// Then the largest factor is 29
		System.out.println(largest);
	}
}

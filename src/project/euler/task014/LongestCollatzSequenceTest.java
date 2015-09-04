package project.euler.task014;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCollatzSequenceTest {

	@Test
	public void givenResult() throws Exception {
		// Given we want to compute the Collatz sequence using the following algorithm
		// n → n/2 (n is even)
		// n → 3n + 1 (n is odd)
		LongestCollatzSequence longestCollatz = new LongestCollatzSequence();

		// When we compute sequence of the integer 13
		// 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
		long number = longestCollatz.apply(13);

		// Then the number of the longest sequence from 1..13 is 9
		assertEquals("The returned number was wrong", 9, number);
	}
	
	@Test
	public void test() throws Exception {
		// Given we want to compute the Collatz sequence using the following algorithm
		// n → n/2 (n is even)
		// n → 3n + 1 (n is odd)
		LongestCollatzSequence longestCollatz = new LongestCollatzSequence();

		// When we compute longest sequence under the 1.000.000
		long number = longestCollatz.apply(999999);

		// Then the number of the longest sequence is
		System.out.println(number);
	}
	
}

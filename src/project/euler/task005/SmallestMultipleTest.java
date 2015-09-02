package project.euler.task005;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmallestMultipleTest {

	@Test
	public void givenResult() throws Exception {
		// Given we search for the smallest evenly divisible positive number
		SmallestMultiple smallestMultiple = new SmallestMultiple();

		// When we want it to be evenly divisible from 1 to 10
		int limit = 10;
		int result = smallestMultiple.apply(limit);

		// Then the result is 2520
		assertEquals("The returned result was wrong", 2520, result);
		for (int i = 1; i <= limit; i++) {
			assertEquals("The remainder was wrong", 0, result % i);
		}
	}

	@Test
	public void test() throws Exception {
		// Given we search for the smallest evenly divisible positive number
		SmallestMultiple smallestMultiple = new SmallestMultiple();

		// When we want it to be evenly divisible from 1 to 20
		int limit = 20;
		int result = smallestMultiple.apply(limit);

		System.out.println(result);
	}

}

package project.euler.task012;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HighlyDivisibleTriangularNumberTest {

	@Test
	public void givenResult() throws Exception {
		// Given we can generate the sequence of triangle numbers
		HighlyDivisibleTriangularNumber triangular = new HighlyDivisibleTriangularNumber();

		// When we are looking for the first triangle number to have over five divisors
		long result = triangular.apply(5);

		// Then the result is 28
		assertEquals("The returned triange number was wrong", 28L, result);
	}

	@Test
	public void test() throws Exception {
		// Given we can generate the sequence of triangle numbers
		HighlyDivisibleTriangularNumber triangular = new HighlyDivisibleTriangularNumber();

		// When we are looking for the first triangle number to have over 500 divisors
		long result = triangular.apply(500);

		// Then
		System.out.println(result);
	}
}

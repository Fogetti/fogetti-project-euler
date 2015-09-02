package project.euler.task004;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import project.euler.task004.LargestPalindromeProduct.Factor;

public class LargestPalindromeProductTest {

	@Test
	public void givenResult() throws Exception {
		// Given we want to find the largest palindrome of numbers
		LargestPalindromeProduct palindrome = new LargestPalindromeProduct();

		// When we are talking about two 2-digit numbers
		Factor results = palindrome.apply(99);

		// Then the result is 9009 = 91 * 99
		assertEquals("The sum was wrong", 9009, results.factor1 * results.factor2);
		assertEquals("The first factor was wrong", 99, (int)results.factor1);
		assertEquals("The second factor was wrong", 91, (int)results.factor2);
	}

	@Test
	public void test() throws Exception {
		// Given we want to find the largest palindrome of numbers
		LargestPalindromeProduct palindrome = new LargestPalindromeProduct();

		// When we are talking about two 3-digit numbers
		Factor results = palindrome.apply(999);

		System.out.println("Factor1: " + results.factor1 + ", Factor2: " + results.factor2);
	}

}

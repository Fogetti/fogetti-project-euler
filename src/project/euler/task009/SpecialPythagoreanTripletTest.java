package project.euler.task009;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SpecialPythagoreanTripletTest {

	@Test
	public void givenResult() throws Exception {
		// Given a set of three natural numbers, a < b < c, for which a^2 + b^2 = c^2
		SpecialPythagoreanTriplet triplet = new SpecialPythagoreanTriplet();

		// When 3^2 + 4^2 = 9 + 16 = 25 = 5^2
		int product = triplet.apply(12);

		// Then a + b + c = 12 and a * b * c = 60
		assertEquals("The returned Pythagorean product was wrong", 60, product);
	}

	@Test
	public void test() throws Exception {
		// Given a set of three natural numbers, a < b < c, for which a^2 + b^2 = c^2
		SpecialPythagoreanTriplet triplet = new SpecialPythagoreanTriplet();

		// When a + b + c = 1000
		int product = triplet.apply(1000);

		// Then
		System.out.println(product);
	}
}

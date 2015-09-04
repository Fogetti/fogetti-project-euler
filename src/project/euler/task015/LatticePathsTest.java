package project.euler.task015;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LatticePathsTest {

	@Test
	public void givenRule() throws Exception {
		// Given we have a grid of size 2 x 2
		LatticePaths paths = new LatticePaths();

		// When we calculate the number of lattice paths
		long count = paths.apply(2,2);

		// Then it returns 6
		assertEquals("The returned path count was wrong", 6, count);
	}
	
	@Test
	public void testName() throws Exception {
		// Given we have a grid of size 2 x 2
		LatticePaths paths = new LatticePaths();

		// When we calculate the number of lattice paths
		long count = paths.apply(20,20);

		// Then it returns
		System.out.println(count);
	}
}

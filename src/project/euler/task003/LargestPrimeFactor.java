package project.euler.task003;

import java.util.TreeSet;

/**
 * https://en.wikipedia.org/wiki/Trial_division
 * http://en.literateprograms.org/Trial_division_(Java)
 * 
 * @author gergely.nagy
 *
 */
public class LargestPrimeFactor {

	public TreeSet<Integer> apply(long number) {
		long n = number;
		TreeSet<Integer> factors = new TreeSet<>();
		for (int i = 2; i <= n; i++) {
			while ((n % i) == 0) {
				factors.add(i);
				n /= i;
			}
		}
		return factors;
	}

}

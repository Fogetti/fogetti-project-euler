package project.euler.task004;

import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;

public class LargestPalindromeProduct {
	
	public static class Factor implements Comparable<Factor> {
		public Integer factor1;
		public Integer factor2;
		
		@Override
		public int compareTo(Factor o) {
			int other = o.factor1 * o.factor2;
			int self = this.factor1 * this.factor2;
			return self - other;
		}
	}

	public Factor apply(int limit) {
		TreeSet<Factor> factors = new TreeSet<>();
		for (int i = limit; i > 0; i--) {
			for (int j = limit; j > 0; j--) {
				int product = i*j;
				String str = Integer.toString(product);
				String reverse = StringUtils.reverse(str);
				if (str.equals(reverse)) {
					Factor factor = new Factor();
					factor.factor1 = i;
					factor.factor2 = j;
					factors.add(factor);
					break;
				}
			}
		}
		return factors.last();
	}

}

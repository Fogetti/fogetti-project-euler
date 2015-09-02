package project.euler.task008;

import java.util.TreeSet;

public class LargestProductInASeries {
	
	private static class Adjacent implements Comparable<Adjacent> {
		
		public String adjacent;

		@Override
		public int compareTo(Adjacent o) {
			long resultThis = productOf(this.adjacent);
			long resultOther = productOf(o.adjacent);
			boolean smallerThan = resultThis < resultOther;
			boolean equalsWith = resultThis == resultOther;
			return (smallerThan) ? -1 : (equalsWith ? 0 : 1);
		}

		protected long productOf(String adjacent) {
			char[] chars = adjacent.toCharArray();
			long result = 1;
			for (char c : chars) {
				result *= Character.getNumericValue(c);
			}
			return result;
		}

		@Override
		public String toString() {
			return "Adjacent [adjacent=" + adjacent + ", product=" + productOf(adjacent) + "]";
		}
		
	}

	public long apply(String number, int length) {
		TreeSet<Adjacent> strings = new TreeSet<>();
		int index = 0;
		while ((index + length) <= number.length()) {
			String substring = number.substring(index, index+length);
			Adjacent adjacent = new Adjacent();
			adjacent.adjacent = substring;
			strings.add(adjacent);
			index++;
		}
		System.out.println(strings);
		Adjacent greatest = strings.last();
		System.out.println(greatest);
		return greatest.productOf(greatest.adjacent);
	}
	
}

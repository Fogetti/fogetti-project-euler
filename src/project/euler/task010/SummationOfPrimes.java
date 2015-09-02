package project.euler.task010;

public class SummationOfPrimes {
	
	private static class LongArray {
		
		boolean[][] sieve;
		int limit;
		
		LongArray(int limit) {
			this.sieve = new boolean[limit][limit];
			this.limit = limit;
		}
		
		public void add(long index, boolean bool) {
			int i = (int)(index / limit);
			int j = (int)(index % limit);
			sieve[i][j] = bool;
		}
		
		public boolean get(long index) {
			int i = (int)(index / limit);
			int j = (int)(index % limit);
			return sieve[i][j];
		}
	}
	
	public long apply(int limit) {
		double sqrt = Math.ceil(Math.sqrt(limit));
		LongArray sieve = new LongArray((int)Math.round(sqrt));
		for (int i = 0; i < limit; i++) {
			sieve.add(i, true);
		}
		sieve.add(0, false);
		sieve.add(1, false);
		long result = 0;
		for (int i = 2; i < limit; i++) {
			if (sieve.get(i)) {
				for (int j = i+i; j < limit; j += i) {
					sieve.add(j, false);
				}
			}
		}
		long count = 0;
		while (count < limit) {
			if (sieve.get(count)) {
				result += count;
			}
			count++;
		}
		return result;
	}

}

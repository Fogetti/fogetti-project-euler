package project.euler.task007;

public class FindNthPrime {

	public int apply(int limit) {
		int upperlimit = limit * limit;
		int count = 0;
		int result = -1;
		boolean[] primes = new boolean[upperlimit];
		for (int i = 0; i < primes.length; i++) {
			primes[i] = true;
		}
		primes[0] = false;
		primes[1] = false;
		for (int i = 2; i < upperlimit; i++) {
			if (primes[i]) {
				count++;
				if (count == limit) {
					result = i;
					break;
				}
				for (int j = i + i; j < upperlimit; j += i) {
					primes[j] = false;
				}
			}
		}
		return result;
	}

}

package project.euler.task007;

public class FindNthPrime02 {

	public static int apply(int limit) {
		int upperLimit = limit * limit;
		boolean[] sieve = new boolean[upperLimit];
		for (int i = 0; i < sieve.length; i++) {
			sieve[i] = true;
		}
		sieve[0] = false;
		sieve[1] = false;
		for (int i = 2; i < upperLimit; i++) {
			for (int j = 2; j < limit && i*j < upperLimit; j++) {
				sieve[i*j] = false;
			}
		}
		int result = -1;
		int count = 0;
		for (int i = 0; i < sieve.length; i++) {
			if (sieve[i]) {
				count++;
			}
			if (count == limit) {
				result = i;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(apply(10001));
	}
}

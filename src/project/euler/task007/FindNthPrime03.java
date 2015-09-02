package project.euler.task007;

public class FindNthPrime03 {

	public static int apply(int limit) {
		int upperlimit = limit*limit;
		boolean[] sieve = new boolean[upperlimit];
		for (int i = 0; i < upperlimit; i++) {
			sieve[i] = true;
		}
		sieve[0] = false;
		sieve[1] = false;
		int count = 0;
		int result = -1;
		for (int i = 2; i < upperlimit; i++) {
			if (sieve[i]) {
				count++;
				if (count == limit) {
					result = i;
					break;
				}
				for (int j = i+i; j < upperlimit; j += i) {
					sieve[j] = false;
				}
			}
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(apply(10001));
	}
}

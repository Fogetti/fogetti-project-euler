package project.euler.task005;

/**
 * https://en.wikipedia.org/wiki/Greatest_common_divisor#Using_prime_factorizations
 * 
 * @author gergely.nagy
 *
 */
public class SmallestMultiple {

	public int apply(int limit) {
		int[] input = new int[limit];
		for (int i = 0; i < limit; i++) {
			input[i] = i + 1;
		}
		return lcm(input);
	}
	
	public static int gcm(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public static int gcm(int[] input) {
		int result = input[0];
		for (int i = 1; i < input.length; i++) result = gcm(result, input[i]);
		return result;
	}
	
	public static int lcm(int a, int b) {
		return a * (b / gcm(a, b));
	}
	
	public static int lcm(int[] input) {
		int result = input[0];
		for (int i = 1; i < input.length; i++) result = lcm(result, input[i]);
		return result;
	}

}

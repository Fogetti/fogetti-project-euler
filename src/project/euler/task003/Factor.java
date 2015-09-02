package project.euler.task003;

public class Factor {

	public static long apply(long n) {
		for (int i = 2; i < n; i++) {
			while (n % i == 0) {
				n /= i;
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		System.out.println(apply(600851475143L));
	}
}

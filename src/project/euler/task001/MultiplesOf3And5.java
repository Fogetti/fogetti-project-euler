package project.euler.task001;

public class MultiplesOf3And5 {

	public static void main(String[] args) {
		int n = 1000;
		int[] res = new int[n];
		for (int i = 1; i < n; i++) {
			if (i%3 == 0 || i%5 == 0) {
				res[i-1] = i;
			} else {
				res[i-1] = 0;
			}
		}
		long sum = 0;
		for (int i = 0; i < res.length; i++) {
			sum += res[i];
		}
		System.out.println(sum);
	}
	
}

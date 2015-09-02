package project.euler.task012;

public class HighlyDivisibleTriangularNumber {
	
	public long apply(int limit) {
		long divisors = 0;
		long sum = 0;
		int i = 1;
		while (divisors < limit) {
			sum += i;
			System.out.print("#" + sum + ", ");
			divisors = findFactors(sum);
			System.out.print(divisors + "\n");
			i++;
		}
		return sum;
	}

	protected long findFactors(long sum) {
		long factors = 0;
		int sqrt = (int) Math.sqrt(sum);
		
		for(long test = 1; test <= sqrt; test++) {
			if(sum % test == 0)
				factors += 2;
		}
		
		if (sqrt * sqrt == sum) {
	        factors--;
	    }
		
		return factors;
	}

}

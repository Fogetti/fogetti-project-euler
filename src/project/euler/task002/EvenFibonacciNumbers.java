package project.euler.task002;

import java.util.ArrayList;
import java.util.List;

public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		List<Long> fibonaccies = new ArrayList<Long>();
		fibonaccies.add(0, 1L);
		fibonaccies.add(1, 2L);
		int i = 2;
		while (fibonaccies.get(i-1) < 4000000) {
			fibonaccies.add(i, fibonaccies.get(i-2) + fibonaccies.get(i-1));
			i++;
		}
		System.out.print("Fibonaccies: \n[");
		for (long fib : fibonaccies) {
			System.out.print(String.format("%s, ", fib));
		}
		System.out.println("end]");
		long result = 0;
		for (Long fib : fibonaccies) {
			result += ((fib % 2) == 0) ? fib : 0; 
		}
		System.out.println(String.format("Result: %s", result));
	}

}

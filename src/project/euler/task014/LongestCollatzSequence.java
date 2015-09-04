package project.euler.task014;

import java.util.Stack;

public class LongestCollatzSequence {
	
	Stack<Long> stack = new Stack<>();

	public long apply(int limit) {
		long terms = 0;
		long result = 0;
		for (long i = limit; i >= 1; i--) {
			long prev = terms;
			stack.push(i);
			terms = Math.max(terms, collatz());
			if (prev != terms) {
				result = i;
			}
		}
		return result;
	}

	protected long collatz() {
		long terms = 1;
		long i = stack.peek();
		while (!stack.isEmpty()) {
			i = stack.pop();
			if (i == 1) return terms;
			if (i % 2 == 0) {
				stack.push(i / 2);
			} else {
				stack.push(3*i + 1);
			}
			terms++;
		}
		return terms;
	}

}

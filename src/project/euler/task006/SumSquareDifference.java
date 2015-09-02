package project.euler.task006;

public class SumSquareDifference {

	public int apply(int limit) {
		int sumSquare = 0;
		for (int i = 1; i <= limit; i++) {
			sumSquare += i * i;
		}
		int squareSum = 0;
		for (int i = 1; i <= limit; i++) {
			squareSum += i;
		}
		squareSum *= squareSum;
		return squareSum - sumSquare;
	}

}

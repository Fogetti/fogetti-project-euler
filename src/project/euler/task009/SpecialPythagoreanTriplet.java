package project.euler.task009;

public class SpecialPythagoreanTriplet {

	public int apply(int sum) {
		int result = 0;
		int endValueI = sum-1;
		result:
		for (int i = 0; i < endValueI; i++) {
			int endValueJ = endValueI-i;
			for (int j = 0; j < endValueJ; j++) {
				int a = j;
				int b = endValueJ - j;
				if ((result = checkCondition(sum, a, b)) != 0) break result;
			}
		}
		return result;
	}

	protected int checkCondition(int sum, int a, int b) {
		int result = 0;
		int c = (a + b - sum) * -1;
		if (a + b + c == sum) {
			if (c*c == a*a + b*b) {
				System.out.println(a + ", " + b + ", " + c);
				result = a * b * c;
			}
		}
		return result;
	}

}

package project.euler.task005;

public class GCMLLCM02 {

	public static int gcm(int a, int b) {
		while (b != 0) {
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
	
	public static void main(String[] args) {
		System.out.println(lcm(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}));
	}
}

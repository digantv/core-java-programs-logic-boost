package core_java;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int n = 10; 
		generateFibonacciSeries(n);
	}

	public static void generateFibonacciSeries(int n) {
		int firstTerm = 0;
		int secondTerm = 1;

		System.out.println("Fibonacci Series:");

		for (int i = 0; i < n; i++) {
			System.out.print(firstTerm + " ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
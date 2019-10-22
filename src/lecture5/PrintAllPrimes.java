package lecture5;

public class PrintAllPrimes {

	public static void main(String[] args) {
		PrintPrime(0, 10);
	}

	public static void PrintPrime(int ll, int ul) {
		for (int i = ll; i <= ul; i++) {
			if (isPrime(i) == true)
				System.out.println(i);
		}
	}

	public static boolean isPrime(int n) {
		int i = 2;
		while (i < n) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
}

package lecture15;

import java.util.Arrays;

public class PrimeTC {

	public static void main(String[] args) {
		PrintPrime(25);
	}

	public static void PrintPrime(int n) {
		Boolean[] prime = new Boolean[n + 1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;

		for (int table = 2; table * table <= n; table++) {
			if (prime[table] == false)
				continue;
			
			for (int mult = table; mult * table <= n; mult++) {
				prime[mult * table] = false;
			}
		}
		for (int i = 2; i <= n; i++) {
			if (prime[i] == true)
				System.out.println(i);
		}
	}

}

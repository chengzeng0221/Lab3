package primegenerator;

import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {

	public List<Integer> generate(int input) {
		List<Integer> primes = new ArrayList<Integer>();
		for (int i = 2; i < input; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}

	private boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}

package primefactorization;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if (i > 1) {
			primes.add(2);			
		}
		return primes;
	}

}
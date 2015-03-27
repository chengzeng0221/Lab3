package primefactorization;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeFactorizationTests {
	
	private List<Integer> list() {
		return Arrays.asList();
	}
	
	@Test
	public void test_that_the_generated_list_for_1_returns_empty() {
		assertEquals(list(), PrimeFactorization.generate(1));
	}

}

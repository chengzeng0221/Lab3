package primefactorization;

import static org.junit.Assert.*;
import static primefactorization.PrimeFactorization.generate;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeFactorizationTests {
	
	private List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}
	
	@Test
	public void test_that_the_generated_list_for_1_returns_empty() {
		assertEquals(list(), generate(1));
	}
	
	@Test
	public void test_that_the_generated_list_for_2_returns_with_2() {
		assertEquals(list(2), generate(2));
	}
	
	@Test
	public void test_that_the_generated_list_for_3_returns_with_3() {
		assertEquals(list(3), generate(3));
	}
}

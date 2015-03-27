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
	
	@Test
	public void test_that_the_generated_list_for_4_returns_with_2_2() {
		assertEquals(list(2,2), generate(4));
	}
	
	@Test
	public void test_that_the_generated_list_for_6_returns_with_2_3() {
		assertEquals(list(2,3), generate(6));
	}
	
	@Test
	public void test_that_the_generated_list_for_8_returns_with_2_2_2() {
		assertEquals(list(2,2,2), generate(8));
	}
	
	@Test
	public void test_that_the_generated_list_for_9_returns_with_3_3() {
		assertEquals(list(3,3), generate(9));
	}
}

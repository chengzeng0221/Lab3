package primegenerator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeGeneratorTests {
	private Integer input;
	private List<Integer> expectedResult;
	private PrimeGenerator primeGenerator;

	@Before
	public void initialize() {
		primeGenerator = new PrimeGenerator();
	}

	public PrimeGeneratorTests(Integer input, List<Integer> expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}

	private static List<Integer> list(Integer... integers) {
		return Arrays.asList(integers);
	}

	@Parameterized.Parameters
	public static Collection<Object[]> primesList() {
		return Arrays
				.asList(new Object[][] {
						{ 0, list() },
						{ 1, list() },
						{ 6, list(2, 3, 5) },
						{
								100,
								list(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
										37, 41, 43, 47, 53, 59, 61, 67, 71, 73,
										79, 83, 89, 97) } });
	}

	@Test
	public void prime_generator_test() {
		assertEquals(expectedResult, primeGenerator.generate(input));
	}

}



import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import com.lib.FizzBuzz;

/**
 * @author Thor
 * 
 */
public class TestLib extends TestCase {
	private FizzBuzz fizzBuzz;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		fizzBuzz = new FizzBuzz();
	}

	// @Test
	// public void test() {
	// fail("Not yet implemented");
	// }
	@Test
	public void testDefaultInstance() {
		assertNotNull(fizzBuzz);
		assertEquals(1, fizzBuzz.getFirstValue());
		assertEquals(100, fizzBuzz.getSecondValue());
		assertEquals("fizz", fizzBuzz.getWords()[0]);
		assertEquals("buzz", fizzBuzz.getWords()[1]);
		assertEquals("1", fizzBuzz.fizzBuzz(1, fizzBuzz.getWords()));
		assertEquals("fizz", fizzBuzz.fizzBuzz(3, fizzBuzz.getWords()));
		assertEquals("buzz", fizzBuzz.fizzBuzz(5, fizzBuzz.getWords()));
		assertEquals("fizzbuzz", fizzBuzz.fizzBuzz(15, fizzBuzz.getWords()));
	}

	@Test
	public void testSpecificValue() {
		assertNotNull(fizzBuzz);
		fizzBuzz.setFirstValue(15);
		assertEquals("fizzbuzz", fizzBuzz.fizzBuzz(fizzBuzz.getFirstValue(),
				fizzBuzz.getWords()));
		fizzBuzz.setFirstValue(10);
		assertEquals("buzz", fizzBuzz.fizzBuzz(fizzBuzz.getFirstValue(),
				fizzBuzz.getWords()));
	}

	@Test
	public void testSpecificValues() {
		assertNotNull(fizzBuzz);
		fizzBuzz.setFirstValue(15);
		fizzBuzz.setSecondValue(35);
		String[] words = fizzBuzz.getWords();
		String word = "";
		for (int i = fizzBuzz.getFirstValue(); i <= fizzBuzz.getSecondValue(); i++) {
			word = fizzBuzz.fizzBuzz(i, words);
			System.out.println(word);
		}
		assertEquals("buzz", word);
	}

	@Test
	public void testUserDefinedWords() {
		assertNotNull(fizzBuzz);
		String[] words = { "farts" };
		System.out.println("len: " + words.length);
		String word = "";
		for (int i = fizzBuzz.getFirstValue(); i <= fizzBuzz.getSecondValue(); i++) {
			word = fizzBuzz.fizzBuzz(i, words);
			System.out.println(word);
		}
		assertEquals("Too few or Too Many words defined", word);
	}
}

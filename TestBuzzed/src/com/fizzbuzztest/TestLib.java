package com.fizzbuzztest;

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

}

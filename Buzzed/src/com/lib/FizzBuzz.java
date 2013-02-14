/**
 * 
 */
package com.lib;

/**
 * @author Thor
 * 
 */
public class FizzBuzz {
	private int firstValue;
	private int secondValue;
	private String[] words;

	/**
	 * Initialize the function to defalut values, which are 1 for firstValue,
	 * 100 for secoundValue, fizz if its divisible by 3, buzz if divisable by 5
	 * and fizzbuzz if divisible by both
	 */
	public FizzBuzz() {
		setFirstValue(1);
		setSecondValue(100);
		setWords(new String[] { "fizz", "buzz" });
	}

	/**
	 * @return the firstValue
	 */
	public int getFirstValue() {
		return firstValue;
	}

	/**
	 * @param firstValue
	 *            the firstValue to set
	 */
	public void setFirstValue(int firstValue) {
		this.firstValue = firstValue;
	}

	/**
	 * @return the secondValue
	 */
	public int getSecondValue() {
		return secondValue;
	}

	/**
	 * @param secondValue
	 *            the secondValue to set
	 */
	public void setSecondValue(int secondValue) {
		this.secondValue = secondValue;
	}

	/**
	 * @return the string array of words
	 */
	public String[] getWords() {
		return words;
	}

	/**
	 * @param words
	 *            the string array of words to set
	 */
	public void setWords(String[] words) {
		this.words = words;
	}

	/**
	 * Prints out the default instance of this, which take the first value and
	 * loops to the second value and prints out the word based on default
	 * condition
	 */
	public void defaultInstance() {
		for (int i = getFirstValue(); i <= getSecondValue(); i++) {
			String output = fizzBuzz(i, words);
			System.out.println(output);
		}
	}

	/**
	 * 
	 * @param value
	 *            the value to evaluate if its divisible by 3 or 5 or both
	 * @param words
	 *            the string array of words to use
	 * @return result string is returned either word0, word1, word0+word1 or the
	 *         number
	 */
	public String fizzBuzz(int value, String[] words) {
		if (words.length != 2)
			return "Too few or Too Many words defined";

		if (value % 3 == 0)
			if (value % 5 == 0)
				return (words[0] + words[1]);
			else
				return (words[0]);
		else if (value % 5 == 0)
			return (words[1]);
		else
			return String.valueOf(value);
	}

}

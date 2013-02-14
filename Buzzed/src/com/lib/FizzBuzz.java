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
	 * 
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
	 * 
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
	 * @param words
	 * @return
	 */
	public String fizzBuzz(int value, String[] words) {
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

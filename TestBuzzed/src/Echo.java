import com.lib.FizzBuzz;

/**
 * 
 */

/**
 * @author Thor
 * 
 */
public class Echo {
	static FizzBuzz fizzBuzz;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		fizzBuzz = new FizzBuzz();

		int firstArg = 1;
		if (args.length > 0) {
			try {
				firstArg = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.err.println("Argument" + " must be an integer");
				System.exit(1);
			}
		}

		System.out.println(fizzBuzz.fizzBuzz(14, fizzBuzz.getWords()));

		int secondArg = 1;
		if (args.length > 0) {
			try {
				firstArg = Integer.parseInt(args[1]);
			} catch (NumberFormatException e) {
				System.err.println("Argument" + " must be an integer");
				System.exit(1);
			}
		}

		fizzBuzz.setFirstValue(firstArg);
		fizzBuzz.setSecondValue(secondArg);
		String words[] = { "fizz", "buzz" };
		for (int i = firstArg; i <= secondArg; i++) {
			System.out.println(fizzBuzz.fizzBuzz(i, words));
		}
	}

}

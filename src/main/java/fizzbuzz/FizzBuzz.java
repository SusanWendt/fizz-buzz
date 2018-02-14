package fizzbuzz;

public class FizzBuzz {

	public String say(int number) {
		if (isFizz(number) && isBuzz(number)) {
			return "fizzbuzz";
		}
		if (isFizz(number)) {
			return "fizz";
		}
		if (isBuzz(number)) {
			return "buzz";
		}
		return "" + number;
	}

	private boolean isBuzz(int number) {
		return number %5 == 0;
	}
	
	private boolean isFizz(int n) {
		return n % 3 == 0;
	}
}

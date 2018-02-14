package fizzbuzz;

public class FizzBuzzApp {

	public static void main(String[] args) {
		FizzBuzz myFizzBuzz = new FizzBuzz(); 
		int count = 0;
		for (int i = 0; i <= 100 ; i++) {

		System.out.println(myFizzBuzz.say(count));
		count++; 
		}
	}
}

package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void shouldSayOne() {
		// arrange
		FizzBuzz underTest = new FizzBuzz();

		// act
		String response = underTest.say(1);

		// assert
		Assert.assertEquals("1", response);
	}

	@Test
	public void shouldSayTwo() {
		FizzBuzz underTest = new FizzBuzz();
		String response = underTest.say(2);
		Assert.assertEquals("2", response);
	}

	@Test
	public void shouldSayFizz() {
		FizzBuzz underTest = new FizzBuzz();
		String response = underTest.say(3);
		Assert.assertEquals("fizz", response);
	}

	@Test
	public void shouldSayBuzz() {
		FizzBuzz underTest = new FizzBuzz();
		String response = underTest.say(5);
		Assert.assertEquals("buzz", response);
	}
	@Test 
	public void shouldSayFizzForSix() {
		FizzBuzz underTest = new FizzBuzz();
		String response = underTest.say(6);
		Assert.assertEquals("fizz", response);
	}
	@Test 
	public void shouldSayBuzzForTen() {
		FizzBuzz underTest = new FizzBuzz();
		String response = underTest.say(10);
		Assert.assertEquals("buzz", response);
	}
	@Test 
	public void shouldSayFizzBuzz() {
		FizzBuzz underTest = new FizzBuzz();
		String response = underTest.say(15);
		Assert.assertEquals("fizzbuzz", response);
	}
}

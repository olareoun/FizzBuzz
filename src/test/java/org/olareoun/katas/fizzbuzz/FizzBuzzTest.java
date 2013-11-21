package org.olareoun.katas.fizzbuzz;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;
import org.olareoun.katas.fizzbuzz.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void say_fizz_when_3() {
		assertThat(new FizzBuzz().say(3), is("fizz"));
	}

	@Test
	public void say_fizz_when_3_multiple() {
		assertThat(new FizzBuzz().say(6), is("fizz"));
	}

	@Test
	public void say_fizz_when_contains_3() {
		assertThat(new FizzBuzz().say(13), is("fizz"));
	}

	@Test
	public void say_buzz_when_5() {
		assertThat(new FizzBuzz().say(5), is("buzz"));
	}
	
	@Test
	public void say_buzz_when_5_multiple() {
		assertThat(new FizzBuzz().say(10), is("buzz"));
	}
	
	@Test
	public void say_buzz_when_contains_5() {
		assertThat(new FizzBuzz().say(25), is("buzz"));
	}
	
	@Test
	public void say_fizzbuzz_if_multiple_of_both(){
		assertThat(new FizzBuzz().say(15), is("fizzbuzz"));
	}
	
	@Test
	public void say_number_otherwise(){
		assertThat(new FizzBuzz().say(2), is("2"));
	}

}

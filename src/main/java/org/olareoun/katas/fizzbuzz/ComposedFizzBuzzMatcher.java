package org.olareoun.katas.fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComposedFizzBuzzMatcher implements FizzBuzzMatcher{

	List<FizzBuzzMatcher> rules = new ArrayList<FizzBuzzMatcher>();

	public ComposedFizzBuzzMatcher(FizzBuzzMatcher... rules){
		if (rules.length > 0)
			this.rules = Arrays.asList(rules);
	}

	public boolean matches(int i) {
		boolean matches = false;
		for (FizzBuzzMatcher rule : rules) {
			matches = matches || rule.matches(i);
		}
		return matches;
	}

}

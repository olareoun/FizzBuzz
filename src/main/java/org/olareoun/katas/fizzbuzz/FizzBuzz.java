package org.olareoun.katas.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	private StringBuilder what;
	private List<FizzBuzzRule> fizzBuzzRules;

	public FizzBuzz(){
		this.what = new StringBuilder();
		this.fizzBuzzRules = new ArrayList<FizzBuzzRule>();
		this.fizzBuzzRules.add(new SayWhen(new ComposedFizzBuzzMatcher(Multiple.pivot(3), Contains.pivot(3)), "fizz"));
		this.fizzBuzzRules.add(new SayWhen(Multiple.pivot(5), "buzz"));
		this.fizzBuzzRules.add(new JustYou(what));
	}

	public String say(int i) {
		for (FizzBuzzRule rule : fizzBuzzRules) {
			if (rule.matches(i))
				what.append(rule.say());
		}
		return what.toString();
	}

}

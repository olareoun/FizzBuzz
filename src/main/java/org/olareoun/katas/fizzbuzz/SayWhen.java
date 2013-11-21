package org.olareoun.katas.fizzbuzz;

public class SayWhen implements FizzBuzzRule{

	private String whatToSay;
	private FizzBuzzMatcher rule;

	public SayWhen(FizzBuzzMatcher rule, String whatToSay) {
		this.rule = rule;
		this.whatToSay = whatToSay;
	}

	public String say() {
		return whatToSay;
	}

	public boolean matches(int i) {
		return rule.matches(i);
	}

}

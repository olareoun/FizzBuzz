package org.olareoun.katas.fizzbuzz;

public class JustYou implements FizzBuzzRule{

	private StringBuilder what;
	private int self;

	public JustYou(StringBuilder what){
		this.what = what;
	}

	public boolean matches(int i) {
		this.self = i;
		return this.what.length() == 0;
	}

	public String say() {
		return String.valueOf(this.self);
	}

}

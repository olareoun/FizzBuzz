package org.olareoun.katas.fizzbuzz;

public class Multiple implements FizzBuzzMatcher{

	private int pivot;

	private Multiple(int pivot){
		this.pivot = pivot;
	}

	public boolean matches(int i) {
		return i % this.pivot == 0;
	}

	public static FizzBuzzMatcher pivot(int i){
		return new Multiple(i);
	}
}


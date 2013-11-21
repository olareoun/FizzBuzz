package org.olareoun.katas.fizzbuzz;

public class Contains implements FizzBuzzMatcher{
	
	private int pivot;

	private Contains(int pivot){
		this.pivot = pivot;
	}

	public boolean matches(int i) {
		return String.valueOf(i).contains(String.valueOf(this.pivot));
	}

	public static FizzBuzzMatcher pivot(int i){
		return new Contains(i);
	}
}

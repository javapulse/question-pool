package com.javapulse;

public class Question2 {

	/*
		Which is true of the code below?
		A) X421-8-8-XY8
		B) X421-8-8-XY8
		C) X541-8-8-XY8
		D) X41-8-53-XY53
		E) None of the above.
	 */

	void create(int x, int y, String phrase) {
		System.out.print(phrase + 4 + 1 + "-");
		System.out.print(x + y);
		System.out.print("-" + x + y + "-");
		System.out.print(processPhrase(phrase) + x + y);
	}

	String processPhrase(String phrase) {
		return phrase + "Y";
	}

	public static void main(String[] args) {
		Question2 s = new Question2();
		s.create(5, 3, "X");
	}

}

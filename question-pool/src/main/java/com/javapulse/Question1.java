package com.javapulse;

public class Question1 {

	// What is the output of the following program?
	private static int num;
	private static String[] fruits = new String[] {
			"Apple",
			"Banana",
			"Orange",
			"Grape",
			"Kiwi"
	};

	public static void main(String[] args) {
		while (num < fruits.length) {
			if (fruits[num++].length() < 6) {
				break;
			}
		}
		System.out.println(num);
	}

}

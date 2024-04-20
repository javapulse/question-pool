package com.javapulse;

import java.util.Arrays;
import java.util.List;

public class Question4 {

	// What is the result of the following code?

	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
		List<String> result = numbers.stream().dropWhile(number -> number.contains("1")).toList();
		System.out.println(result);
	}
}

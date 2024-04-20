package com.javapulse;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Question5 {

	// What is the result of the following code?

	public static void main(String[] args) {
		List<String> languageList = new ArrayList<>();
		languageList.add("Java");
		languageList.add("Scala");
		languageList.add("Java");
		Set<String> languageSet = new TreeSet<>(languageList);
		System.out.print(languageSet.size());
		System.out.print("-" );
		System.out.print(languageSet.iterator().next());
	}
}

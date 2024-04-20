package com.javapulse;

public class Question8 {

	// What is the result of the following program?

	public static void main(String[] args) {
		try {
			System.out.print("apptID ");
			throw new RuntimeException("Invalid");
		} catch (NullPointerException npe) {
			System.out.print("error ");
			throw npe;
		} finally {
			System.out.print("log ");
		}
	}

}

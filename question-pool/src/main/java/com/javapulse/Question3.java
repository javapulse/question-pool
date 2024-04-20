package com.javapulse;

public class Question3 {

	// What is the result of compiling and running the following code?

	/*
	class AccountNotFoundException extends Exception {}
	class InsufficientFundsException extends AccountNotFoundException {}

	public void processBankTransaction() throws RuntimeException { // A
		try {
			throw new InsufficientFundsException();
		} catch (Exception e) {
			throw new IllegalArgumentException();
		} finally {
			throw new AccountNotFoundException(); // B
		}
	}

	public static void main(String[] args) {
		new Question3().processBankTransaction(); // C
	}
	 */

}

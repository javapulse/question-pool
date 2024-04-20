package com.javapulse;

public class Question6 {

	// Which is true of the following program?

	public void configure() { configure(141,true); } //A
	public int configure(int code) { return code + 1; }; //B
	public int configure(int code, boolean allow) {
		return configure(code);
	}
	public static void main(String[] args) {
		//System.out.print(new Question6().configure());//C
	}
}

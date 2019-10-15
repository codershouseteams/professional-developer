/**
 * -----Coder's House Teams-----
 * Skype: luongvu.work@gmail.com
 * Mail: codershouseteams@gmail.com
 * Phone Number: (+84) 0935710974 - (+84) 0935810974
 * Project Name: 01.java-basic
 * Create Date: Oct 15, 2019
 */
package com.richard.app.Impl;


import com.richard.app.interfaces.*;

/**
 * @author richard
 *
 */
public class MathOperationImpl implements MathOperation {
	// with type declaration
	MathOperation addition = (int a, int b) -> a + b;

	// with out type declaration
	MathOperation subtraction = (a, b) -> a - b;

	// with return statement along with curly braces
	MathOperation multiplication = (int a, int b) -> {
		return a * b;
	};

	// without return statement and without curly braces
	MathOperation division = (int a, int b) -> a / b;

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

	public void run() {
		MathOperationImpl mathOperation = new MathOperationImpl();
		System.out.println("10 + 5 = " + mathOperation.operate(10, 5, mathOperation));
		System.out.println("10 - 5 = " + mathOperation.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + mathOperation.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + mathOperation.operate(10, 5, division));

		// without parenthesis
		Greeting greet1 = message -> System.out.println("Hello " + message);

		// with parenthesis
		Greeting greet2 = (message) -> System.out.println("Hello " + message);

		greet1.sayMessage("Richard Vu");
		greet2.sayMessage("Luong Vu");
	}

	@Override
	public int operation(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}

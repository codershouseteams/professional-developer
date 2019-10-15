/**
 * -----Coder's House Teams-----
 * Skype: luongvu.work@gmail.com
 * Mail: codershouseteams@gmail.com
 * Phone Number: (+84) 0935710974 - (+84) 0935810974
 * Project Name: 01.java-basic
 * Create Date: Oct 15, 2019
 */
package com.richard.app.test;

import com.richard.app.interfaces.Greeting;

/**
 * @author richard
 *
 */
public class LambdaExpressionsTest {
	final static String salutation = "Hello! ";
	public static void main(String args[]) {
		Greeting greet1 = message -> System.out.println(salutation + message);
		greet1.sayMessage("Richard");
	}
}

/**
 * -----Coder's House Teams-----
 * Skype: luongvu.work@gmail.com
 * Mail: codershouseteams@gmail.com
 * Phone Number: (+84) 0935710974 - (+84) 0935810974
 * Project Name: 01.java-language-basics
 * Create Date: Oct 15, 2019
 */
package com.richard.app;

import java.util.Scanner;

import com.richard.app.basic.HelloWorld;

/**
 * @author richard
 *
 */
public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		int choose;
		sc = new Scanner(System.in);
		choose = sc.nextInt();

		switch (choose) {
		case 1: {
			HelloWorld hello = new HelloWorld();
			hello.helloWorld();
			break;
		}
		
		
		default:
			break;
		}
	}
}

/**
 * -----Coder's House Teams-----
 * Skype: luongvu.work@gmail.com
 * Mail: codershouseteams@gmail.com
 * Phone Number: (+84) 0935710974 - (+84) 0935810974
 * Project Name: 01.java-basic
 * Create Date: Oct 15, 2019
 */
package com.richard.app.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author richard
 *
 */
public class MethodReferenceTest {
	public static void main(String args[]) {
		List<String> names = new ArrayList<String>();

		names.add("Richard");
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");
		
		names.forEach((n)->{
			System.out.println("---------");
			System.out.println("[" +n +"]");
			System.out.println("---------");
		});
		
//		for (String name : names) {
//			System.out.println(name);
//		}
	}
}

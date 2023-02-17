/**
 * 
 */
package com.signify.service;

/**
 * @author aksha
 *
 */
public class CalculatorService {
	// create non static methods here
	public int addition(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		if(b!=0) {
			return a/b;
		}
		return 0;
	}
	public static String testStatic() {
		return "Hi I'm a Static Method";
	}	
}

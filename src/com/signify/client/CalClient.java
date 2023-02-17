/**
 * 
 */
package com.signify.client;

import com.signify.abstract1.MathExtension;
import com.signify.service.CalculatorService;

/**
 * @author aksha
 *
 */
public class CalClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Access all business methods of Calculator Service class
		MathExtension maths = new MathExtension();
		System.out.println(maths.add(10,5));
		System.out.println(maths.dif(10,8));
	}

}

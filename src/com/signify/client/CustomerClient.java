/**
 * 
 */
package com.signify.client;

import com.signify.service.CustomerService;

/**
 * @author aksha
 *
 */
public class CustomerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService service = new CustomerService();
		service.createCustomer();
		service.updateCustomer(1);
		service.deleteCustomer(1);
		service.listCustomer();
		

	}

}

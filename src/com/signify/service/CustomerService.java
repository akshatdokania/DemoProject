/**
 * 
 */
package com.signify.service;

/**
 * @author aksha
 *
 */
public class CustomerService {
	public void createCustomer() {
		System.out.println("Created new customer");
	}
	public void deleteCustomer(int customerId) {
		System.out.println("Deleted cutomer with ID - "+customerId);
	}
	public void updateCustomer(int customerId) {
		System.out.println("Updated Customer with ID - "+customerId);
	}
	public void listCustomer() {
		System.out.println("Listing Customers....");
	}
}

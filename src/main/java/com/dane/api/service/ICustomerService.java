package com.dane.api.service;

import java.util.List;

import com.dane.api.model.Customer;

public interface ICustomerService {

	public Customer save(Customer customer);
	
	public void delete (Long Id);
	
	public Customer findById(Long Id);
	
	public List<Customer> findAll();
}

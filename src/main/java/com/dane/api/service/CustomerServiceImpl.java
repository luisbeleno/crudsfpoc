package com.dane.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dane.api.interfaces.ICustomer;
import com.dane.api.model.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	private ICustomer data;

	@Override
	@Transactional(readOnly = false)
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return data.save(customer);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Long Id) {
		// TODO Auto-generated method stub
		data.deleteById(Id);
	}

	@Override
	@Transactional(readOnly = true)
	public Customer findById(Long Id) {
		// TODO Auto-generated method stub
		return data.findById(Id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return (List<Customer>)data.findAll();
	}

}

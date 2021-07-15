package com.dane.api.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.dane.api.model.Customer;

public interface ICustomer extends CrudRepository<Customer, Long> {

}

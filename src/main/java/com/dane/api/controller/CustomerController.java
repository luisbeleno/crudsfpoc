package com.dane.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dane.api.model.Customer;
import com.dane.api.service.ICustomerService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	private ICustomerService service;
	
	
	@PostMapping("/customer")
	public Customer save(@RequestBody Customer customer) {
		return service.save(customer);
	}
	
	
	@GetMapping("/customer")
	public List<Customer> findAll(){
		return service.findAll();
	}
	
	
	@GetMapping("/customer/{id}")
	public Customer findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	
	@PutMapping("/customer/{id}")
	public Customer update(@RequestBody Customer customer, @PathVariable Long id) {
		Customer customerFind = service.findById(id);
		customerFind.setApellido(customer.getApellido());
		customerFind.setNombre(customer.getNombre());
		customerFind.setEmail(customer.getEmail());
		customerFind.setTelefono(customer.getTelefono());
		
		return service.save(customerFind);		
	}
	
	
	@DeleteMapping("/customer/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
		
	}
}

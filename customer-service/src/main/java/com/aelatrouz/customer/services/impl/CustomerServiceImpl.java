package com.aelatrouz.customer.services.impl;

import com.aelatrouz.customer.Customer;
import com.aelatrouz.customer.CustomerRegistrationRequest;
import com.aelatrouz.customer.repository.CustomerRepository;
import com.aelatrouz.customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public void registerCustomer(CustomerRegistrationRequest request) {
		Customer customer = Customer.builder()
				.firstName(request.firstName())
				.lastName(request.lastName())
				.email(request.email())
				.build();
		//TODO: vaildate email
		//TODO: check email is not taken
		//TODO: save customer to db
		customerRepository.save(customer);


	}
}

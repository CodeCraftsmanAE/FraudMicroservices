package com.aelatrouz.customer;

import com.aelatrouz.customer.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping
	public String checkHealth() {
		return "working correctly!";
	}


	@PostMapping
	public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
		log.info("Register customer {}", customerRegistrationRequest );
		customerService.registerCustomer(customerRegistrationRequest);
	}
}

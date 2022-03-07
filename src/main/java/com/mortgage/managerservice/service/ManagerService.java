package com.mortgage.managerservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mortgage.managerservice.model.CustomerDetails;

public interface ManagerService {
	public List<CustomerDetails> getAllDetails();
	public CustomerDetails getDetailsByCustomerId(int customerId);
	public CustomerDetails updateCustomerDetails(int customerId,CustomerDetails customerDetails);
	public void deleteCustomerDetails(int customerId);
	


}

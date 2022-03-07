package com.mortgage.managerservice.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mortgage.managerservice.exception.ResourceNotFoundException;
import com.mortgage.managerservice.model.CustomerDetails;
import com.mortgage.managerservice.repository.ManagerRepository;

@Service
public class ManagerServiceImpl implements ManagerService {
	private static final Logger logger = LoggerFactory.getLogger(ManagerServiceImpl.class);

	@Autowired
	private ManagerRepository managerRepository;

	@Override
	public List<CustomerDetails> getAllDetails() {
		List<CustomerDetails> products = managerRepository.findAll();

		return products;
	}

	@Override
	public CustomerDetails getDetailsByCustomerId(int customerId) throws ResourceNotFoundException {
		Optional<CustomerDetails> optionalCustomerDetails = managerRepository.findById(customerId);

		if (optionalCustomerDetails.isEmpty()) {

			throw new ResourceNotFoundException("Sorry! Customer not found with id" + customerId);

		}
		return optionalCustomerDetails.get();
	}

	@Override
	public CustomerDetails updateCustomerDetails(int customerId, CustomerDetails customerDetails) {
		 Optional<CustomerDetails> optionalCustomerDetails = managerRepository.findById(customerDetails.getCustomerId());
			
			if(optionalCustomerDetails.isEmpty()) {
				
				throw new ResourceNotFoundException("Sorry! Customer not found with id" +customerDetails.getCustomerId());
				
			}
			
			CustomerDetails updatedProduct = managerRepository.save(customerDetails);
			return updatedProduct;
		}


	@Override
	public void deleteCustomerDetails(int customerId) {	
     Optional<CustomerDetails> optionalCustomerDetails = managerRepository.findById(customerId);
		
		if(optionalCustomerDetails.isPresent()) {
			
			managerRepository.deleteById(customerId);
			
		}
		
		else {
			throw new ResourceNotFoundException("sorry Customer is not existing with id:" +customerId);
		}
		
	}

}
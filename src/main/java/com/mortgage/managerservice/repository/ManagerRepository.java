package com.mortgage.managerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mortgage.managerservice.model.CustomerDetails;

@Repository
public interface ManagerRepository extends JpaRepository<CustomerDetails, Integer> {

}

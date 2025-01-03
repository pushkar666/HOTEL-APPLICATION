package com.hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    
}

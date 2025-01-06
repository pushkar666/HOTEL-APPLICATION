package com.hotel.Service;

import java.util.List;

import com.hotel.Entity.Customer;

public interface CustomerService {
    
    
	public Customer saveCustomer (Customer customer);
	public List<Customer> getAllCustomer();
    public Customer getCustomerById(Integer id);
    public String deleteCustomer (Integer id);
}

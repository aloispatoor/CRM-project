package com.m2i.CRM.service;

import com.m2i.CRM.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> getAllCustomers();
    Optional<Customer> getCustomerById(int id);
    String deleteCustomer(int id);
    Customer updateCustomer(Customer c);
    Customer addCustomer(Customer c);
}

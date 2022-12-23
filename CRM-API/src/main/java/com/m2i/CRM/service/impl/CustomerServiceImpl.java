package com.m2i.CRM.service.impl;

import com.m2i.CRM.entity.Customer;
import com.m2i.CRM.repository.CustomerRepository;
import com.m2i.CRM.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository repo;

    public List<Customer> getAllCustomers(){
        return repo.findAll();
    }

    public Customer addCustomer(Customer c){
        c = new Customer();
        return repo.save(c);
    }

    public Optional<Customer> getCustomerById(int id){
        return repo.findById(id);
    }

    public String deleteCustomer(int id){
        if(repo.findById(id).isPresent()){
            repo.deleteById(id);
            return "Customer removed successfully";
        }
        return "No Customer found";
    }

    public Customer updateCustomer(Customer c){
        Customer newCustomer = repo.findById(c.getId()).orElse(null);
        if(newCustomer != null){
            newCustomer.setEmail(c.getEmail());
            newCustomer.setLastName(c.getLastName());
            newCustomer.setFirstName(c.getFirstName());
            newCustomer.setCompany(c.getCompany());
            newCustomer.setMobile(c.getMobile());
            newCustomer.setNotes(c.getNotes());
            repo.save(newCustomer);
        }
        return newCustomer;
    }
}

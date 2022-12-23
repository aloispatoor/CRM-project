package com.m2i.CRM.controller;

import com.m2i.CRM.entity.Customer;
import com.m2i.CRM.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/customers")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping("")
    public List<Customer> getAll(){
        return service.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getById(@PathVariable int id){
        return service.getCustomerById(id);
    }

    @PostMapping("")
    public Customer post(@RequestBody Customer c){
        return service.addCustomer(c);
    }

    @PutMapping("/{id}")
    public Customer update(@PathVariable int id, @RequestBody Customer c){
        c.setId(id);
        return service.updateCustomer(c);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return service.deleteCustomer(id);
    }
}

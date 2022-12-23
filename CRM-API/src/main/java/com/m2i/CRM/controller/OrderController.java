package com.m2i.CRM.controller;

import com.m2i.CRM.entity.Order;
import com.m2i.CRM.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/orders")
public class OrderController {
    @Autowired
    private OrderService service;

    @GetMapping("")
    public List<Order> getAll(){
        return service.getAllOrders();
    }

    @GetMapping("/{id}")
    public Optional<Order> getById(@PathVariable int id){
        return service.getOrderById(id);
    }

    @PostMapping("")
    public Order post(@RequestBody Order o){
        return service.addOrder(o);
    }

    @PutMapping("/{id}")
    public Order update(@PathVariable int id, @RequestBody Order o){
        o.setId(id);
        return service.updateOrder(o);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return service.deleteOrder(id);
    }
}

package com.m2i.CRM.service.impl;

import com.m2i.CRM.entity.Order;
import com.m2i.CRM.repository.OrderRepository;
import com.m2i.CRM.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository repo;

    @Override
    public List<Order> getAllOrders() {
        return repo.findAll();
    }

    @Override
    public Optional<Order> getOrderById(int id) {
        return repo.findById(id);
    }

    @Override
    public Order addOrder(Order o) {
        o = new Order();
        return repo.save(o);
    }

    @Override
    public String deleteOrder(int id) {
        if(repo.findById(id).isPresent()){
            repo.deleteById(id);
            return "Order removed successfully";
        }
        return "No Order found";
    }

    @Override
    public Order updateOrder(Order o) {
        Order newOrder = repo.findById(o.getId()).orElse(null);
        if(newOrder != null){
            newOrder.setLabel(o.getLabel());
            newOrder.setAdrEt(o.getAdrEt());
            newOrder.setNotes(o.getNotes());
            newOrder.setNumberOfDays(o.getNumberOfDays());
            newOrder.setTva(o.getTva());
            newOrder.setType(o.getType());
            newOrder.setStatus(o.getStatus());
        }
        return null;
    }
}

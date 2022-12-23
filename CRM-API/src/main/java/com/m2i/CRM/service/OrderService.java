package com.m2i.CRM.service;

import com.m2i.CRM.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    List<Order> getAllOrders();
    Optional<Order> getOrderById(int id);
    Order addOrder(Order o);
    String deleteOrder(int id);
    Order updateOrder(Order o);
}

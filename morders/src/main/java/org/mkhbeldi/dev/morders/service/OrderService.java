package org.mkhbeldi.dev.morders.service;

import org.mkhbeldi.dev.morders.model.Order;
import org.mkhbeldi.dev.morders.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService implements IOrderService{

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Iterable<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public Order saveOrUpdateOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void removeOrder(Long id) {
        orderRepository.deleteById(id);
    }
}

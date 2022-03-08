package org.mkhbeldi.dev.morders.service;

import org.mkhbeldi.dev.morders.model.Order;

import java.util.Optional;

public interface IOrderService {

    Iterable<Order> getAllOrders();

    Optional<Order> getOrderById(Long id);

    Order saveOrUpdateOrder(Order order);

    void removeOrder(Long id);
}

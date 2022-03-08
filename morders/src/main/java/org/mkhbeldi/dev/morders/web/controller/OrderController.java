package org.mkhbeldi.dev.morders.web.controller;

import org.mkhbeldi.dev.morders.model.Order;
import org.mkhbeldi.dev.morders.service.IOrderService;
import org.mkhbeldi.dev.morders.web.exception.CannotAddOrUpdateOrderException;
import org.mkhbeldi.dev.morders.web.exception.OrderNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    IOrderService  orderService;

    @PostMapping(value = "/order")
    public ResponseEntity<Order> addOrder(@RequestBody Order orderToAdd){
        Order order = orderService.saveOrUpdateOrder(orderToAdd);
        if( order == null) throw new CannotAddOrUpdateOrderException("Unable to add or update this order");
        return new ResponseEntity<Order>(order, HttpStatus.CREATED);
    }

    @GetMapping(value = "/orders/{id}")
    public Optional<Order> getOrderById(@PathVariable Long id){
        Optional<Order> order = orderService.getOrderById(id);
        if(!order.isPresent()) throw new OrderNotFoundException("This order does not exist");
        return order;
    }
}

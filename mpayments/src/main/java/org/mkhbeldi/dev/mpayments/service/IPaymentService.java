package org.mkhbeldi.dev.mpayments.service;

import org.mkhbeldi.dev.mpayments.model.Payment;

import java.util.Optional;

public interface IPaymentService {

    Iterable<Payment> getAllOrders();

    Optional<Payment> getPaymentById(Long id);

    Payment saveOrUpdatePayment(Payment payment);

    void removePayment(Long id);

    Payment getPaymentByOrderId(Long id);

}

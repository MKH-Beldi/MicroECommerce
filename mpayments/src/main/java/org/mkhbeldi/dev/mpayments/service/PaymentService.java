package org.mkhbeldi.dev.mpayments.service;

import org.mkhbeldi.dev.mpayments.model.Payment;
import org.mkhbeldi.dev.mpayments.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentService implements IPaymentService {

    @Autowired
    PaymentRepository paymentRepository;
    @Override
    public Iterable<Payment> getAllOrders() {
        return paymentRepository.findAll();
    }

    @Override
    public Optional<Payment> getPaymentById(Long id) {
        return paymentRepository.findById(id);
    }

    @Override
    public Payment saveOrUpdatePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public void removePayment(Long id) {
        paymentRepository.deleteById(id);
    }

    @Override
    public Payment getPaymentByOrderId(Long id) {
        return paymentRepository.findByOrderId(id);
    }
}

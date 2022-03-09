package org.mkhbeldi.dev.mpayments.repository;

import org.mkhbeldi.dev.mpayments.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

    Payment findByOrderId(Long orderId);
}

package org.mkhbeldi.dev.morders.repository;

import org.mkhbeldi.dev.morders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}

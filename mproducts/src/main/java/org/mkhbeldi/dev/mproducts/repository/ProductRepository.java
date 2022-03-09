package org.mkhbeldi.dev.mproducts.repository;

import org.mkhbeldi.dev.mproducts.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

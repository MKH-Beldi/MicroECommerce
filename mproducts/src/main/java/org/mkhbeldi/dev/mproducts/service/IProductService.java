package org.mkhbeldi.dev.mproducts.service;

import org.mkhbeldi.dev.mproducts.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<Product> getAllProducts();

    Optional<Product> getProductById(Long id);

    Product saveOrUpdateProduct(Product product);

    void removeProduct(Long id);
}

package org.mkhbeldi.dev.mproducts.web.controller;

import org.mkhbeldi.dev.mproducts.configuration.ApplicationPropertiesConfiguration;
import org.mkhbeldi.dev.mproducts.model.Product;
import org.mkhbeldi.dev.mproducts.service.IProductService;
import org.mkhbeldi.dev.mproducts.web.exeption.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired IProductService productService;
    @Autowired ApplicationPropertiesConfiguration  propertiesConfiguration;

    // Displays the list of all available products
    @GetMapping(value = "/products")
    public Iterable<Product> getAllProductList(){
        List<Product> products = productService.getAllProducts();
        if(products.isEmpty()) throw new ProductNotFoundException("No product is available for sale");
        return products.subList(0, propertiesConfiguration.getLimitProducts());
    }

    //Retrieve a product by its id
    @GetMapping( value = "/products/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        Optional<Product> product = productService.getProductById(id);
        if(!product.isPresent())  throw new ProductNotFoundException("The product corresponding to the id " + id + " does not exist");
        return product;
    }
}

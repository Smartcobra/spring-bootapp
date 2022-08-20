package com.swam.ecomm.service;

import com.swam.ecomm.entity.Product;
import com.swam.ecomm.repo.ProductRepo;

import java.util.List;

public interface ProductService {
    public List<Product> allProducts();
    public Product createProduct(Product product);
}

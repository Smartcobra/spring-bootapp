package com.swam.ecomm.controller;

import com.swam.ecomm.entity.Product;
import com.swam.ecomm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/allproducts")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.allProducts();
        return ResponseEntity.ok().body(products);
    }

    @PostMapping("/createproduct")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        String productId = UUID.randomUUID().toString();
        product.setProductId(productId);
        Product pro = productService.createProduct(product);
        if (pro.getProductId().equals(product.getProductId())) {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
}

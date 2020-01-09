package com.iktex.productapi.controller;

import com.iktex.productapi.entity.Product;
import com.iktex.productapi.service.ProductService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Iterable<Product>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable long id) {
        var data = service.findById(id);
        if (data.isPresent()) {
            return ResponseEntity.ok(data.get());
        } else {
            return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product entity) {
        return ResponseEntity.ok(service.upsert(entity));
    }

    @PutMapping
    public ResponseEntity<Product> update(@RequestBody Product entity) {
        return ResponseEntity.ok(service.upsert(entity));
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody Product entity) {
        service.delete(entity);
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable long id) {
        service.deleteById(id);
        return ResponseEntity.ok(null);
    }
}

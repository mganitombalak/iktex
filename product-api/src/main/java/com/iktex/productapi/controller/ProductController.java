package com.iktex.productapi.controller;

import com.iktex.productapi.entity.Product;
import com.iktex.productapi.model.ResponseModel;
import com.iktex.productapi.service.ProductService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

@CrossOrigin(maxAge = 3600,origins = "*")
@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<ResponseModel<Product>> findAll() throws UnknownHostException {

        var returnValue =new ResponseModel<Product>();
        returnValue.setServer(InetAddress.getLocalHost().getHostName());
        returnValue.setData(service.findAll());
        return ResponseEntity.ok(returnValue);
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

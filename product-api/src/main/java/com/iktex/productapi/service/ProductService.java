package com.iktex.productapi.service;


import com.iktex.productapi.entity.Product;
import com.iktex.productapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }
    public Iterable<Product> findAll(){
        return repository.findAll();
    }

    public Optional<Product> findById(long Id){
        return repository.findById(Id);
    }

    public Product upsert(Product entity){
        return repository.save(entity);
    }

    public void delete(Product entity){
        repository.delete(entity);
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }
}

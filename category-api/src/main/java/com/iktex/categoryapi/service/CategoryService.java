package com.iktex.categoryapi.service;

import com.iktex.categoryapi.entity.Category;
import com.iktex.categoryapi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {
    private CategoryRepository repository;

    @Autowired
    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public Iterable<Category> findAll(){
        return repository.findAll();
    }

    public Optional<Category> findById(long Id){
        return repository.findById(Id);
    }

    public Category upsert(Category entity){
        return repository.save(entity);
    }

    public void delete(Category entity){
        repository.delete(entity);
    }

    public void deleteById(long id){
         repository.deleteById(id);
    }
}

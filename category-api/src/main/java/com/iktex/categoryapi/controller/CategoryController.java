package com.iktex.categoryapi.controller;

import com.iktex.categoryapi.entity.Category;
import com.iktex.categoryapi.service.CategoryService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryService service;

    @Autowired
    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Iterable<Category>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable long id) {
        var data = service.findById(id);
        if (data.isPresent()) {
            return ResponseEntity.ok(data.get());
        } else {
            return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<Category> save(@RequestBody Category entity) {
        return ResponseEntity.ok(service.upsert(entity));
    }

    @PutMapping
    public ResponseEntity<Category> update(@RequestBody Category entity) {
        return ResponseEntity.ok(service.upsert(entity));
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody Category entity) {
        service.delete(entity);
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable long id) {
        service.deleteById(id);
        return ResponseEntity.ok(null);
    }
}

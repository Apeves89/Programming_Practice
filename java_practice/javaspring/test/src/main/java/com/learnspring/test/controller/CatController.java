package com.learnspring.test.controller;

import com.learnspring.test.entity.Cat;
import com.learnspring.test.repository.catRepository;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CatController {
    
    public catRepository CATS;

    public CatController(catRepository CATS){
        this.CATS = CATS;
    }

    @GetMapping("/cat")
    public List<Cat> getCats(){
        return CATS.findAll();
    }

    @PostMapping("/cat")
    public List<Cat> createCat(@RequestBody Cat newCat){
        CATS.save(newCat);
        return CATS.findAll();
    }

    @PutMapping("/cat/{id}")
    public List<Cat> updateCat (@RequestBody Cat updatedCat, @PathVariable Integer id){
        CATS.findById(id)
                .map(cat ->{
                    cat.setName(updatedCat.getName());
                    cat.setAge(updatedCat.getAge());
                    return CATS.save(cat);
                })
                .orElseGet(() -> {
                    return CATS.save(updatedCat);
                });
                return CATS.findAll();
    }

    @DeleteMapping("/cat/{id}")
    public List<Cat> deleteCat(@PathVariable Integer id){
        CATS.deleteById(id);
        return CATS.findAll();
    }
    
}

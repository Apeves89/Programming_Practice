package com.learnspring.test.repository;

import com.learnspring.test.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;


public interface catRepository extends JpaRepository<Cat, Integer> {
    
}

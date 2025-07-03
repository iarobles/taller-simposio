package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entidades.Compra;

public interface CompraRepo extends CrudRepository<Compra, Integer> {
    
}

package com.example.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.Compra;
import com.example.demo.repos.CompraRepo;

@RestController
public class CompraControlador {
    @Autowired
    CompraRepo compraRepo;

    // solución ejercicio
    @GetMapping("/compras/{id}")
    public Compra obtenerCompra(@PathVariable Integer id) {
        return compraRepo.findById(id).get();
    }
    
}

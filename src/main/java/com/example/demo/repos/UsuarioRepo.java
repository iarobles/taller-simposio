package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entidades.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario,Integer>{
    
}

package com.example.demo.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.Usuario;
import com.example.demo.repos.UsuarioRepo;

@RestController
public class UsuarioControlador {

    // Inyectamos el repositorio de usuarios
    @Autowired
    UsuarioRepo usuarioRepo;

    @GetMapping("/")
    public String inicio(){
      return "hola mundo";   
    }

    @GetMapping("/usuario/{id}")
    public Usuario obtenerUsuario(@PathVariable("id") Integer id){
        // obtenemos de la base al usuario
        Usuario usuario = usuarioRepo.findById(id).get();
        return usuario;
    }
    
}

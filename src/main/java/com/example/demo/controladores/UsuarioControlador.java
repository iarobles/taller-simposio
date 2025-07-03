package com.example.demo.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.Usuario;
import com.example.demo.repos.UsuarioRepo;

@RestController
@CrossOrigin(origins = "*") // Permite solicitudes desde cualquier origen
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

    @PostMapping("/usuario")
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    
}

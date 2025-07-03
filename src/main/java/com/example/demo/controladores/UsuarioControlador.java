package com.example.demo.controladores;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioControlador {

    @GetMapping("/")
    public String inicio(){
      return "hola mundo";   
    }
    
}

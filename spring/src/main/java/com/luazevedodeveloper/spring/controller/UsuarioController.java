package com.luazevedodeveloper.spring.controller;

import com.luazevedodeveloper.spring.entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/usuarios")
public class UsuarioController {

    @GetMapping
    public ResponseEntity<Usuario> findAll(){
        Usuario usuario = new Usuario(1L,"Marcelo", "marcelo@gmail.com", "98262-5594", "123456" );

        return ResponseEntity.ok().body(usuario);
    }
}

package com.luazevedodeveloper.spring.repositories;

import com.luazevedodeveloper.spring.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

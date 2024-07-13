package com.luazevedodeveloper.spring.repositories;

import com.luazevedodeveloper.spring.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}

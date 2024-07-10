package com.luazevedodeveloper.spring.repositories;

import com.luazevedodeveloper.spring.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}

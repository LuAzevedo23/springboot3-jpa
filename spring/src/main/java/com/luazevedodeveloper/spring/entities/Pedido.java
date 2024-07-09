package com.luazevedodeveloper.spring.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date momentoDoPedido;

    @ManyToOne
    @JoinColumn(name = "cliente_id")   //muitos para um do BD
    private Usuario cliente;

    public Pedido() {

    }
}




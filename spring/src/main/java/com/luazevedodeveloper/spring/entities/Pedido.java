package com.luazevedodeveloper.spring.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.io.Serializable;
import java.time.Instant;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant momentoDoPedido;

    private Integer statusDoPedido;
    //Estou dizendo que estou gravando no BD um numero inteiro

    @ManyToOne
    @JoinColumn(name = "cliente_id")   // Muitos pedidos para um cliente no banco de dados
    private Usuario cliente;

    // Construtor com todos os argumentos
    public Pedido(Long id, Instant momentoDoPedido, StatusDoPedido statusDoPedido, Usuario cliente) {
        this.id = id;
        this.momentoDoPedido = momentoDoPedido;
        this.statusDoPedido = statusDoPedido != null ? statusDoPedido.getCode() : null;
        this.cliente = cliente;
    }

    // Construtor vazio necessário para JPA
    public Pedido() {
    }
}



package com.luazevedodeveloper.spring.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "tb_categoria")
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Categoria (){
    }

    public Categoria(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

}

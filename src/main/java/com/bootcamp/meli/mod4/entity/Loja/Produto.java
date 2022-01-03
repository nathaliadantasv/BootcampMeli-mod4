package com.bootcamp.meli.mod4.entity.Loja;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    private Long id;
    private String descricao;
    private String cor;
    private int quantidade;
    private double preco;
}

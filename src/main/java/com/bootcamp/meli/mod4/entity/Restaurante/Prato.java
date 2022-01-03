package com.bootcamp.meli.mod4.entity.Restaurante;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prato {

    private Long id;
    private String descricao;
    private double preco;
    private int quantidade;
}

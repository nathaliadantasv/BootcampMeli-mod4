package com.bootcamp.meli.mod4.entity.CalculadoraImobiliaria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data //Setar getters e setters
@AllArgsConstructor //gera o construtor cheio com todos argumentos
@NoArgsConstructor
public class Casa {

    private String nome;
    private String endereco;
    private List<Comodo> comodos;
}

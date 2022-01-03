package com.bootcamp.meli.mod4.entity.Loja;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Pedido {

    private Long id;
    private List<Produto> produtos;
    private double valorTotal;

    public Pedido(Long id, List<Produto> produtos) {
        this.id = id;
        this.produtos = produtos;
        for (Produto produto : produtos) {
            this.valorTotal += (produto.getPreco() * produto.getQuantidade());
        }
    }

}

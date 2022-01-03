package com.bootcamp.meli.mod4.entity.Restaurante;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
public class Pedido {

    private Long id;
    private Long idMesa;
    private List<Prato> pratos;
    private double valorTotal;

    public Pedido(Long id, Long idMesa, List<Prato> pratos) {
        this.id = id;
        this.idMesa = idMesa;
        this.valorTotal = 0;
        for (Prato prato : pratos) {
            this.valorTotal += prato.getPreco() * prato.getQuantidade();
        }
    }

}

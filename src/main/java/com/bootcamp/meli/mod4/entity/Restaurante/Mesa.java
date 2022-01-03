package com.bootcamp.meli.mod4.entity.Restaurante;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Mesa {

    private Long id;
    private List<Pedido> pedidos;
    private double valorTotal;

    public Mesa(Long id, List<Pedido> pedidos) {
        this.id = id;
        this.pedidos = pedidos;
        this.valorTotal = 0;
        for (Pedido pedido : pedidos) {
            valorTotal += pedido.getValorTotal();
        }
    }

    public void fecharMesa(Mesa mesa) {
        mesa.
    }

}

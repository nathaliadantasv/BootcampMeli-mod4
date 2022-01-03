package com.bootcamp.meli.mod4.repository.Restaurante;

import com.bootcamp.meli.mod4.entity.Restaurante.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoRepository {

    private List<Pedido> pedidos = new ArrayList<>();

    public void salvarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> buscarPedidosPorMesa(Long idMesa) {
        return pedidos.stream().filter(pedido -> pedido.getIdMesa() == idMesa).collect(Collectors.toList());
    }
}

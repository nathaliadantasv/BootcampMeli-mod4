package com.bootcamp.meli.mod4.entity.Restaurante;

public class Caixa {

    private static double valorTotal;

    public double getValorTotal() {
        return valorTotal;
    }

    public static void adicionarValorEmCaixa(Mesa mesa) {
        valorTotal += mesa.getValorTotal();
    }
}

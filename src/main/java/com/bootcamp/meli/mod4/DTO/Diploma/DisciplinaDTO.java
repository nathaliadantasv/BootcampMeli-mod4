package com.bootcamp.meli.mod4.DTO.Diploma;

import java.util.List;

public class DisciplinaDTO {

    private String nome;
    private List<Integer> notas;
    private double media;

    public DisciplinaDTO(String nome, List<Integer> notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public double getMedia() {
        double total = 0;
        for (Integer i : notas) {
            total += i;
        }

        this.media = total / notas.size();

        return media;
    }
}

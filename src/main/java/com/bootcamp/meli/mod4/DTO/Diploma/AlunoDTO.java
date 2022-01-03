package com.bootcamp.meli.mod4.DTO.Diploma;

import java.util.List;

public class AlunoDTO {

    private String nome;
    private List<DisciplinaDTO> disciplinas;

    public AlunoDTO(String nome, List<DisciplinaDTO> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public List<DisciplinaDTO> getDisciplinas() {
        return disciplinas;
    }


}

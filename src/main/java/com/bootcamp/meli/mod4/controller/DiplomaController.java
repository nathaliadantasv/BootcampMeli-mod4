package com.bootcamp.meli.mod4.controller;

import com.bootcamp.meli.mod4.DTO.AlunoDTO;
import com.bootcamp.meli.mod4.DTO.DisciplinaDTO;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;


@RestController
public class DiplomaController {

    @PostMapping("/retornaDiploma")
    private String calculaMedia(@RequestBody AlunoDTO aluno){
        String nomeAluno = aluno.getNome();
        List<DisciplinaDTO> disciplinas = aluno.getDisciplinas();
        int numeroDeDisciplina = disciplinas.size();
        double somaDasMedias = 0;
        for(DisciplinaDTO d: disciplinas){
            somaDasMedias += d.getMedia();
        }
        double mediaFinal = somaDasMedias / numeroDeDisciplina;

        if(mediaFinal > 9){
            return "Parabéns!! " + nomeAluno + " - Média geral: " + mediaFinal;
        }
        return nomeAluno + " - Média geral: " + mediaFinal;

    }

}

package com.bootcamp.meli.mod4.service;

import com.bootcamp.meli.mod4.DTO.ComodoDTO;
import com.bootcamp.meli.mod4.entity.Casa;
import com.bootcamp.meli.mod4.entity.Comodo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CasaService {

    public double calculaMetroQuadrado(Casa casa){
        double total =0 ;

        for(Comodo c: casa.getComodos()){
            total += c.getComprimento() * c.getLargura();
        }

        return total;
    }

    public double calculaValorCasa(Casa casa){
        double metroQuadrado = calculaMetroQuadrado(casa);

        return metroQuadrado * 800;
    }

    public String calculaMaiorComodo(Casa casa){
        double tamanhoMaiorComodo = 0;
        String nomeMaiorComodo = "";

        for(Comodo c: casa.getComodos()){
            double tamanho = c.getComprimento() * c.getLargura();
            if(tamanho > tamanhoMaiorComodo){
                tamanhoMaiorComodo = tamanho;
                nomeMaiorComodo = c.getNome();
            }
        }

        return "O maior cômodo é a " + nomeMaiorComodo + " que possui " + tamanhoMaiorComodo + " metros quadrados.";
    }

    public List<ComodoDTO> calculaTamanhoPorComodo(Casa casa) {

        List<ComodoDTO> comodos = new ArrayList<ComodoDTO>();
        for(Comodo c: casa.getComodos()){
            String nome = c.getNome();
            double tamanho = c.getLargura() * c.getComprimento();
            comodos.add(new ComodoDTO(nome, tamanho));
        }

        return comodos;
    }

}

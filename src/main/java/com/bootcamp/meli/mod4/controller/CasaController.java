package com.bootcamp.meli.mod4.controller;

import com.bootcamp.meli.mod4.DTO.ComodoDTO;
import com.bootcamp.meli.mod4.entity.Casa;
import com.bootcamp.meli.mod4.service.CasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CasaController {

    @Autowired
    private CasaService casaService;

    @PostMapping("/area/nomeDaCasa")
    public double getMetrosQuadrados(@RequestBody Casa casa) {
        return casaService.calculaMetroQuadrado(casa);
    }

    @PostMapping("/valor/nomeDaCasa")
    public double getValorCasa(@RequestBody Casa casa) {
        return casaService.calculaValorCasa(casa);
    }

    @PostMapping("/maiorComodo/nomeDaCasa")
    public String getMaiorComodo(@RequestBody Casa casa) {
        return casaService.calculaMaiorComodo(casa);
    }

    @PostMapping("/areaComodos/nomeDaCasa")
    public List<ComodoDTO> getAreaComodos(@RequestBody Casa casa) {
        return casaService.calculaTamanhoPorComodo(casa);
    }
}

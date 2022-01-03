package com.bootcamp.meli.mod4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanosController {

    @GetMapping(path = "/numero/{numeroDecimal}")
    public String converterParaRomanos(@PathVariable String numeroDecimal) {
        String valor = "Opcão não cadastrada. Escolha um outro valor de 1-10.";
        switch (numeroDecimal) {
            case "1":
                valor = "I";
                break;
            case "2":
                valor = "II";
                break;
            case "3":
                valor = "III";
                break;
            case "4":
                valor = "IV";
                break;
            case "5":
                valor = "V";
                break;
            case "6":
                valor = "VI";
                break;
            case "7":
                valor = "VII";
                break;
            case "8":
                valor = "VIII";
                break;
            case "9":
                valor = "IX";
                break;
            case "10":
                valor = "X";
                break;
        }

        return numeroDecimal + " em romanos é igual a " + valor;
    }


}

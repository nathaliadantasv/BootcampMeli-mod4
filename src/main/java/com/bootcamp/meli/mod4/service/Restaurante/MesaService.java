package com.bootcamp.meli.mod4.service.Restaurante;

import com.bootcamp.meli.mod4.entity.Restaurante.Mesa;
import com.bootcamp.meli.mod4.repository.Restaurante.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MesaService {

    @Autowired
    private MesaRepository mesaRepository;

    public void salvar(Mesa mesa) {
        mesaRepository.salvar(mesa);
    }

    public Mesa buscaMesaPorId(Long id) {
        return mesaRepository.buscaMesaPorId(id);
    }

}

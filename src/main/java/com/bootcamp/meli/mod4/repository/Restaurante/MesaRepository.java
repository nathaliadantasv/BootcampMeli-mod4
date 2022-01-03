package com.bootcamp.meli.mod4.repository.Restaurante;

import com.bootcamp.meli.mod4.entity.Restaurante.Mesa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MesaRepository {

    private List<Mesa> mesas = new ArrayList<>();

    public void salvar(Mesa mesa) {
        mesa.setId((long) mesas.size() + 1);
        mesas.add(mesa);
    }

    public Mesa buscaMesaPorId(Long id) {
        return mesas.stream().filter(mesa -> mesa.getId() == id).findAny().orElse(new Mesa());
    }
}

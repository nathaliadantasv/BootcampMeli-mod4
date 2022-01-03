package com.bootcamp.meli.mod4.repository.Loja;

import com.bootcamp.meli.mod4.DTO.Loja.ClienteDTO;
import com.bootcamp.meli.mod4.entity.Loja.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository {

    List<Cliente> clientes = new ArrayList<>();

    public void salvar(Cliente cliente) {
        clientes.add(cliente);
    }


}

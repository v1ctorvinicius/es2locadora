package org.es2locadora.cliente.ports.out;

import java.util.List;

import org.es2locadora.cliente.Cliente;

public interface ClienteRepository {
    List<Cliente> getAll();

    Cliente findByCpf(String cpf);

    void create(Cliente cliente);

    List<Cliente> findByNome(String nome);
}
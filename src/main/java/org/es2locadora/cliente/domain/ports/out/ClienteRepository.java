package org.es2locadora.cliente.domain.ports.out;

import org.es2locadora.cliente.domain.Cliente;

public interface ClienteRepository {
    // List<Cliente> getAll();
    void create(Cliente cliente);

    Cliente findByCpf(String cpf);

}
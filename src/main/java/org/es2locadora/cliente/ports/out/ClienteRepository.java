package org.es2locadora.cliente.ports.out;

import java.util.List;

import org.es2locadora.cliente.Cliente;

public interface ClienteRepository {
    List<Cliente> getAll();
    
    void create(Cliente cliente);
    
    Cliente findByCpf(String cpf);
}
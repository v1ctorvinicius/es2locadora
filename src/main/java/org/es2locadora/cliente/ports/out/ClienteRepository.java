package org.es2locadora.cliente.ports.out;

import java.util.List;

import org.es2locadora.cliente.Cliente;

public interface ClienteRepository {

    Cliente findByCpf(String cpf);

    List<Cliente> findByNome(String nome);
}
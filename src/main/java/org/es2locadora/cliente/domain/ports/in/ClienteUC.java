package org.es2locadora.cliente.domain.ports.in;

import org.es2locadora.cliente.domain.Cliente;

public interface ClienteUC {
    Cliente buscarPorCpf(String cpf);
    Cliente cadastrarCliente(Cliente cliente);
}

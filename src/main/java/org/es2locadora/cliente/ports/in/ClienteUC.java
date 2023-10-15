package org.es2locadora.cliente.ports.in;

import org.es2locadora.cliente.Cliente;

public interface ClienteUC {
    Cliente buscarPorCpf(String cpf);
    Cliente cadastrarCliente(Cliente cliente);
}

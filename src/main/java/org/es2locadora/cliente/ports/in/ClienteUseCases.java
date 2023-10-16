package org.es2locadora.cliente.ports.in;

import org.es2locadora.cliente.Cliente;

public interface ClienteUseCases {
    Cliente buscarPorCpf(String cpf);
    Cliente cadastrarCliente(Cliente cliente);
}

package org.es2locadora.cliente.ports.in;

import org.es2locadora.cliente.Cliente;

import java.util.List;

public interface ClienteUseCases {
    Cliente buscarPorCpf(String cpf);

    Cliente cadastrarCliente(Cliente cliente);

    List<Cliente> buscarPeloNome(String nome);

}

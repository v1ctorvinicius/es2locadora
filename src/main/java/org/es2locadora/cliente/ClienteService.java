package org.es2locadora.cliente;

import org.es2locadora.cliente.ports.in.ClienteUseCases;
import org.es2locadora.cliente.ports.out.ClienteRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClienteService implements ClienteUseCases {

    private final ClienteRepository repo;

    @Override
    public Cliente buscarPorCpf(String cpf) {
        return repo.findByCpf(cpf);
    }

    @Override
    public Cliente cadastrarCliente(Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarCliente'");
    }

}

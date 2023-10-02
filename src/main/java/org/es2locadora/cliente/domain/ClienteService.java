package org.es2locadora.cliente.domain;

import org.es2locadora.cliente.domain.ports.in.ClienteUC;
import org.es2locadora.cliente.domain.ports.out.ClienteRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClienteService implements ClienteUC {

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

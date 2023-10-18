package org.es2locadora.cliente;

import java.util.List;

import org.es2locadora.cliente.ports.in.ClienteUseCases;
import org.es2locadora.cliente.ports.out.ClienteRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClienteServices implements ClienteUseCases {

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



    @Override
    public List<Cliente> buscarPeloNome(String nome) {
        return repo.findByNome(nome);        
    }

}

package org.es2locadora.cliente.adapter.out;

import javax.persistence.EntityManager;

import org.es2locadora.cliente.domain.Cliente;
import org.es2locadora.cliente.domain.ports.out.ClienteRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClienteRepositoryAdapter implements ClienteRepository {

    private final EntityManager em;

    @Override
    public void salvar(Cliente cliente) {
        this.em.persist(cliente);
    }

}

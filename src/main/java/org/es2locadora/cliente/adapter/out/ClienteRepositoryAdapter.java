package org.es2locadora.cliente.adapter.out;

import javax.persistence.EntityManager;

import org.es2locadora.cliente.domain.Cliente;
import org.es2locadora.cliente.domain.ports.out.ClienteRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClienteRepositoryAdapter implements ClienteRepository {

    private final EntityManager em;

    @Override
    public void create(Cliente cliente) {
        this.em.persist(cliente);
    }

    @Override
    public Cliente findByCpf(String cpf) {
        return this.em.createQuery("from Cliente c where c.cpf = :cpf", Cliente.class)
            .setParameter("cpf", cpf)
            .getSingleResult();
    }

    // public void findById(Integer id) {
    // this.em.find(Cliente.class, id);
    // }

}

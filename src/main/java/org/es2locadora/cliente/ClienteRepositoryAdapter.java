package org.es2locadora.cliente;

import java.util.List;

import javax.persistence.EntityManager;

import org.es2locadora.cliente.ports.out.ClienteRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClienteRepositoryAdapter implements ClienteRepository {
    
    private final EntityManager em;

    @Override
    public List<Cliente> getAll() {
        return this.em.createQuery("from Cliente", Cliente.class).getResultList();
    }

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

}

package org.es2locadora.cliente;

import java.util.List;

import javax.persistence.EntityManager;

import org.es2locadora.cliente.ports.out.ClienteRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClienteRepositoryAdapter implements ClienteRepository {

    private final EntityManager em;

    @Override
    public Cliente findByCpf(String cpf) {
        return this.em.createQuery("from Cliente c where c.cpf = :cpf", Cliente.class)
                .setParameter("cpf", cpf)
                .getSingleResult();
    }

    @Override
    public List<Cliente> findByNome(String nome) {
        return this.em.createQuery("from Cliente c where c.nomeCliente = :nome", Cliente.class)
                .setParameter("nome", nome).getResultList();
    }

}

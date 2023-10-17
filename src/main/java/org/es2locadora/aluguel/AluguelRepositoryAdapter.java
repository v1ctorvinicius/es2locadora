package org.es2locadora.aluguel;


import javax.persistence.EntityManager;

import org.es2locadora.aluguel.ports.out.AluguelRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AluguelRepositoryAdapter implements AluguelRepository {

    private final EntityManager em;


}

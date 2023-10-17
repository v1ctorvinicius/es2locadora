package org.es2locadora.imovel;


import javax.persistence.EntityManager;

import org.es2locadora.aluguel.ports.out.AluguelRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImovelRepositoryAdapter implements AluguelRepository {

    private final EntityManager em;


}

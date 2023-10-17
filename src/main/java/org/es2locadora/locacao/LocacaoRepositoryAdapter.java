package org.es2locadora.locacao;


import javax.persistence.EntityManager;

import org.es2locadora.locacao.ports.out.LocacaoRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LocacaoRepositoryAdapter implements LocacaoRepository {

    private final EntityManager em;


}

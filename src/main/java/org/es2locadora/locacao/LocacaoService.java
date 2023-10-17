package org.es2locadora.locacao;



import org.es2locadora.cliente.ports.out.ClienteRepository;
import org.es2locadora.locacao.ports.in.LocacaoUseCases;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LocacaoService implements LocacaoUseCases {

    private final ClienteRepository repo;

}

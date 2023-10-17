package org.es2locadora.imovel;


import org.es2locadora.aluguel.ports.in.AluguelUseCases;
import org.es2locadora.cliente.ports.out.ClienteRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImovelService implements AluguelUseCases {

    private final ClienteRepository repo;

}

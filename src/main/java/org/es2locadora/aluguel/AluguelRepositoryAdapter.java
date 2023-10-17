package org.es2locadora.aluguel;

import java.util.List;

import javax.persistence.EntityManager;

import org.es2locadora.aluguel.ports.out.AluguelRepository;
import org.es2locadora.cliente.ports.out.ClienteRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AluguelRepositoryAdapter implements AluguelRepository {

    private final EntityManager em;


}

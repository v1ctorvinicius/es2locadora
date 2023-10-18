package org.es2locadora.imovel;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.es2locadora.imovel.ports.in.ImovelUseCases;
import org.es2locadora.imovel.ports.out.ImovelRepository;

@RequiredArgsConstructor
public class ImovelService implements ImovelUseCases {

    private final ImovelRepository repo;

    @Override
    public List<Imovel> buscarApartamentosDisponiveisPorBairro(String bairro) {
        return repo.findApartamentosDisponiveisPorBairro(bairro);
    }

}

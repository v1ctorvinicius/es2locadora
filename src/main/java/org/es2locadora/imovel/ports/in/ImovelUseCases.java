package org.es2locadora.imovel.ports.in;

import java.util.List;

import org.es2locadora.imovel.Imovel;

public interface ImovelUseCases {
    List<Imovel> buscarApartamentosDisponiveisPorBairro(String bairro);

}

package org.es2locadora.imovel.ports.out;

import java.util.List;

import org.es2locadora.imovel.Imovel;

public interface ImovelRepository {
    List<Imovel> findApartamentosDisponiveisPorBairro(String bairro);
}
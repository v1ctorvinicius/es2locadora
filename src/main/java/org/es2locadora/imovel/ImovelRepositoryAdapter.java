package org.es2locadora.imovel;

import lombok.RequiredArgsConstructor;

import java.util.List;

import javax.persistence.EntityManager;

import org.es2locadora.imovel.ports.out.ImovelRepository;

@RequiredArgsConstructor
public class ImovelRepositoryAdapter implements ImovelRepository {

    private final EntityManager manager;

    @Override
    public List<Imovel> findApartamentosDisponiveisPorBairro(String bairro) {
        return this.manager.createQuery("from Imovel i where i.bairro = :bairro", Imovel.class)
                .setParameter("bairro", bairro).getResultList();

    }

}

package org.es2locadora.integration.aluguel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.es2locadora.aluguel.Aluguel;
import org.es2locadora.aluguel.AluguelServices;
import org.es2locadora.aluguel.ports.in.AluguelUseCases;
import org.es2locadora.aluguel.ports.out.AluguelRepository;
import org.es2locadora.dao.GenericDAO;
import org.es2locadora.dao.GenericDAOAdapter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AluguelTest {



    @Test
    public void deveLancarExcecaoCasoUmPagamentoComValorPagoMenorQueOValorDoAluguelTenteSerInserido() {

    }

    @Test
    public void deveCalcularValorASerPagoDePagamentoVencido() {
      
    }

    @Test
    public void deveInserirSemMultaUmPagamentoNaoVencido() {

    }

    @Test
    public void deveRecuperarTodosOsALugueisPagosDoCLiente() {
        
        

    }

    @Test
    public void deveRecuperarTodosOsAlugueisPagosComAtraso() {

    }
}

package org.es2locadora.integration.imovel;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.es2locadora.dao.GenericDAO;
import org.es2locadora.dao.GenericDAOAdapter;
import org.es2locadora.imovel.Imovel;
import org.es2locadora.imovel.ImovelRepositoryAdapter;
import org.es2locadora.imovel.ImovelService;
import org.es2locadora.imovel.ports.out.ImovelRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImovelTest {

    private static EntityManagerFactory factory;
    private EntityManager manager;
    private GenericDAO<Imovel, Long> testDAO;
    private ImovelRepository repo;

    @BeforeAll
    public static void setup() {
        factory = Persistence.createEntityManagerFactory("es2locadora_test");
    }

    @BeforeEach
    public void beforeEach() {
        this.manager = factory.createEntityManager();
        this.manager.getTransaction().begin();
        this.testDAO = new GenericDAOAdapter<>(manager, Imovel.class);
        repo = new ImovelRepositoryAdapter(manager);
    }

    @AfterEach
    public void afterEach() {
        manager.getTransaction().rollback();
    }

    @AfterAll
    public static void close() {
        factory.close();
    }

    @Test
    public void deveRecuperarTodosOsApartamentosDisponiveisDadoUmBairro() {
        ImovelService service = new ImovelService(repo);
        String bairro = "Centro";

        List<Imovel> apartamentos = service.buscarApartamentosDisponiveisPorBairro(bairro);

        Assertions.assertNotNull(apartamentos);
        Assertions.assertFalse(apartamentos.isEmpty());

        Assertions.assertEquals(3, apartamentos.size());
    }

    @Test
    public void deveRecuperarTodosOsImoveisDisponiveisComValorDoAluguelMenorQue1000() {

    }

}
